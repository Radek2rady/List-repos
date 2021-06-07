package com.gfa.todoonline.controllers;


import com.gfa.todoonline.models.Todo;
import com.gfa.todoonline.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@Controller
@RequestMapping("/todo")
public class TodoController {

    @Autowired
    private TodoRepository todoRepository;

    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @RequestMapping({"", "/list", "/{isActive}"})
    public String list(Model model, @RequestParam(required = false) boolean isActive) {
//        List<Todo> todos = StreamSupport.stream(todoRepository.findAll().spliterator(), false).collect(Collectors.toList());
        if (isActive) {
            model.addAttribute("todos", todoRepository.findByDoneFalse());
        } else {
            model.addAttribute("todos", todoRepository.findAll());
        }
        return "todolist";
    }

    @GetMapping("add")
    public String addTodo() {
        return "add";
    }

    @PostMapping("add")
    public String addTodo(@ModelAttribute Todo todo,
                          @RequestParam(required = false) boolean urgent,
                          @RequestParam(required = false) boolean done,
                          LocalDateTime localDateTime, Model model) {
        todo.isUrgent(urgent);
        todo.isDone(done);

        todoRepository.save(todo);
        return "redirect:/todo/list";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable Long id) {
        todoRepository.deleteById(id);
        return "redirect:/todo/list";
    }

    @GetMapping("/{id}/edit")
    public String editTodo(@PathVariable(name = "id") Long id,
                           Model model) {
        model.addAttribute("id", id);
        model.addAttribute("todo", todoRepository.findById(id));
        return "edit";
    }

    @PostMapping("/{id}/edit")
    public String editTodo(@PathVariable Long id,
                           @RequestParam(required = false) String title,
                           @RequestParam(required = false) boolean urgent,
                           @RequestParam(required = false) boolean done) {
        var todo = todoRepository.findById(id);
        if (todo.isPresent()) {
            var to = todo.get();
            to.setTitle(title);
            to.isUrgent(urgent);
            to.isDone(done);
            todoRepository.save(to);
        }
        return "redirect:/todo/list";
    }

}

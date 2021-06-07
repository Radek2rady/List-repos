package com.gfa.quiz.controllers;

import com.gfa.quiz.models.Question;
import com.gfa.quiz.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class QuizController {
    private final QuestionService questionService;

    @Autowired
    public QuizController(QuestionService questionService) {
        this.questionService = questionService;
    }


    @GetMapping("/home")
    public String homePage(Model model) {
        model.addAttribute("question", questionService.getAll());
        return "index";
    }

    @GetMapping("/home/{score}")
    public String displayScore(@PathVariable(name = "score", required = false) Integer score,
                               Model model) {
        model.addAttribute("score", score);
        model.addAttribute("question", questionService.getAll());
        return "index";
    }

    @GetMapping("/question")
    public String questionForm(Model model) {
        model.addAttribute("question", new Question());
        return "question";
    }

    @PostMapping("/question")
    public String postQuestion(@ModelAttribute Question question) {
        questionService.addQuestion(question);
        return "redirect:/home";
    }

    @GetMapping(value = {"/quiz", "/quiz/{questionId}/{answerId}/{score}"})
    public String quizPage(Model model,
                           @PathVariable(name = "questionId", required = false) Long questionId,
                           @PathVariable(name = "answerId", required = false) Integer answerId,
                           @PathVariable(name = "score", required = false) Integer score) {
        if (questionId == null) {
            model.addAttribute("question", questionService.randomQuestion());
            model.addAttribute("score", score == null ? 0 : score);
            return "quiz";
        }
        Question question = questionService.findQuestionById(questionId);

        if (questionService.checkAnswer(questionId, answerId)) {
            score = score + question.getScore();
            model.addAttribute("question", questionService.randomQuestion());
            model.addAttribute("score", score);
            model.addAttribute("displayCorrect", "Your answer was correct");
            return "quiz";
        }
        return "redirect:/home/" + score;
    }
}

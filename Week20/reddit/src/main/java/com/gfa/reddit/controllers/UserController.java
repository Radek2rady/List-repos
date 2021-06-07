package com.gfa.reddit.controllers;

import com.gfa.reddit.models.Post;
import com.gfa.reddit.models.User;
import com.gfa.reddit.services.PostService;
import com.gfa.reddit.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    @Autowired
    private PostService postService;
    @Autowired
    private UserService userService;


    public UserController(PostService postService, UserService userService) {
        this.postService = postService;
        this.userService = userService;
    }

    @GetMapping("/register")
    public String registerUser() {
        return "/register";
    }

    @PostMapping("/register")
    public String registerUserPost(@ModelAttribute User user) {
        userService.save(user);
        return "redirect:/?username=" + user.getUsername();
    }

    @GetMapping("/login")
    public String loginUser() {
        return "login";
    }

    //working on that

    @PostMapping("/login")
    public String loginUser(Model model,
                            @ModelAttribute User user,
                            @RequestParam String username,
                            @RequestParam String password) {
        User loggedUser = userService.findNameAndPassword(username, password);
        if (user != null) {
            userService.setIsLogged(username);
            return "redirect:/?userID=" + loggedUser.getId();
        }
        return "errorlogin";
    }

    @GetMapping("/{userID}/{pageNr}")
    public String index(@ModelAttribute Post post,
                        Model model,
                        @RequestParam(required = false, defaultValue = "0", name = "pageNr") Integer pageNr,
                        @RequestParam(required = false, name = "userID") Long userID) {
        model.addAttribute("posts", postService.pageableTenPosts(pageNr));
        model.addAttribute("pages", postService.findAll().size());
        model.addAttribute("pageNr", pageNr);
        model.addAttribute("five", postService.fiveByVote());
        return "redirect:/" + userID;
    }
}

package com.gfa.reddit.controllers;

import com.gfa.reddit.models.Post;
import com.gfa.reddit.models.User;
import com.gfa.reddit.services.PostService;
import com.gfa.reddit.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Controller
public class PostController {

    @Autowired
    private PostService postService;
    @Autowired
    private UserService userService;

    public PostController(PostService postService, UserService userService) {
        this.postService = postService;
        this.userService = userService;
    }

    @GetMapping({"/", "/{id}", "/{userID}"})
    public String index(@ModelAttribute User user,
                        Model model,
                        @RequestParam(required = false, defaultValue = "0") Integer pageNr,
                        @RequestParam(required = false) String username,
                        @RequestParam(required = false) boolean isLogged,
                        @PathVariable(required = false, name = "userID") Long userID) {
        model.addAttribute("user", user);
        model.addAttribute("posts", postService.pageableTenPosts(pageNr));
        model.addAttribute("pages", postService.findAll().size());
        model.addAttribute("pageNr", pageNr);
        model.addAttribute("five", postService.fiveByVote());
        return "index";
    }

    @GetMapping("/{userID}/submit")
    public String submit(@PathVariable(required = false, name = "userID") Long userID) {
        return "submit";
    }

    @PostMapping("/{userID}/submit")
    public String submitPost(@ModelAttribute Post post,
                             @PathVariable(required = false, name = "userID") Long userID,
                             Date date) {
        postService.save(post);
        return "redirect:/";
    }

    @GetMapping("/voteUp/{id}")
    public String voteUpGet(@PathVariable Long id,
                            @PathVariable(required = false, name = "userID") Long userID) {
        postService.voteUp(id);
        return "redirect:/";
    }


    @GetMapping("/voteDown/{id}")
    public String voteDownGet(@PathVariable Long id,
                              @PathVariable(required = false, name = "userID") Long userID) {
        postService.voteDown(id);
        return "redirect:/";
    }
}

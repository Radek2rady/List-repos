package com.gfa.reddit.services;

import com.gfa.reddit.models.Post;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface PostService {

    List<Post> findAll();
    void save(Post post);
    Post findById(Long id);
    void voteUp(Long id);
    void voteDown(Long id);
    List<Post> fiveByVote();
    List<Post> pageableTenPosts(Integer pageNr);
}

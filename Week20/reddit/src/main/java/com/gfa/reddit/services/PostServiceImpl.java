package com.gfa.reddit.services;

import com.gfa.reddit.models.Post;
import com.gfa.reddit.repositories.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    PostRepo postRepo;

    public PostServiceImpl(PostRepo postRepo) {
        this.postRepo = postRepo;
    }

    @Override
    public List<Post> findAll() {
        return (List<Post>) this.postRepo.findAll();
    }

    @Override
    public void save(Post post) {
        postRepo.save(post);
    }

    @Override
    public Post findById(Long id) {
        return postRepo.findById(id).orElse(null);
    }

    @Override
    public void voteUp(Long id) {
        Post post = postRepo.findById(id).orElse(null);
        post.voteUp();
        save(post);
    }

    @Override
    public void voteDown(Long id) {
        Post post = postRepo.findById(id).orElse(null);
        post.voteDown();
        save(post);
    }

    @Override
    public List<Post> fiveByVote() {
        return postRepo.findTop5ByOrderByVoteDesc();
    }

    @Override
    public List<Post> pageableTenPosts(Integer pageNr) {
        List<Post> allPostSortedVote = postRepo.findAll(PageRequest.of(pageNr, 10, Sort.by("vote"))).stream().collect(Collectors.toList());
        return allPostSortedVote;
    }

}

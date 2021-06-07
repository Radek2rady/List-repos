package com.gfa.reddit.repositories;

import com.gfa.reddit.models.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.List;

@Repository
public interface PostRepo extends PagingAndSortingRepository<Post, Long> {
//    Post findFirstByOrderByVoteDesc();

    List<Post> findTop5ByOrderByVoteDesc();
//    List<Post> findAllByVote(Long vote, Pageable pageable);
//    List<Post> findFirstByVote();


}

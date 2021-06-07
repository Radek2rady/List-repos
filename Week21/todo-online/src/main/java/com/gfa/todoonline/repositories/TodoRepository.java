package com.gfa.todoonline.repositories;


import com.gfa.todoonline.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {

    List<Todo> findAll();
    List<Todo> findByDoneFalse();
    List<Todo> findByDoneTrue();
}

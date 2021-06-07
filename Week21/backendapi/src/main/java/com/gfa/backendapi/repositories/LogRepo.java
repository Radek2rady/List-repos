package com.gfa.backendapi.repositories;


import com.gfa.backendapi.models.Log;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LogRepo extends CrudRepository<Log, Long> {
    Log save(Log log);

    List<Log> findAll();

    List<Log> findAllByData(PageRequest page);
}

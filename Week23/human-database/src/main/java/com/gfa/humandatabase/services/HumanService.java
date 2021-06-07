package com.gfa.humandatabase.services;

import com.gfa.humandatabase.models.Human;
import com.gfa.humandatabase.models.HumanDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HumanService {
    List<Human> findByLocation(String location);

    List<Human> findAll();

    int avgAge();

    double percentageMens();

    String topLocation();

    void addHuman(HumanDTO humanDTO);
}

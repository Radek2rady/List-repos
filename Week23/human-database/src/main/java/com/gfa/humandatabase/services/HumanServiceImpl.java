package com.gfa.humandatabase.services;

import com.gfa.humandatabase.models.Human;
import com.gfa.humandatabase.models.HumanDTO;
import com.gfa.humandatabase.repositories.HumanRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class HumanServiceImpl implements HumanService {

    private HumanRepository humanRepository;

    public HumanServiceImpl(HumanRepository humanRepository) {
        this.humanRepository = humanRepository;
    }

    @Override
    public List<Human> findByLocation(String location) {
        return humanRepository.findAllByLocation(location);
    }

    @Override
    public List<Human> findAll() {
        return humanRepository.findAll();
    }


    @Override
    public int avgAge() {
        return humanRepository.getAverageAge();
    }

    @Override
    public double percentageMens() {
        var a = (double) humanRepository.findAll().stream().filter(human -> human.getGender().equals("male")).count();
        return a / findAll().size() * 100;
    }


    public String topLocation() {
        return humanRepository.findAll().stream()
                .collect(Collectors.groupingBy(Human::getLocation, Collectors.counting())).keySet().stream().findFirst().orElse(null);
    }

    @Override
    public void addHuman(HumanDTO humanDTO) {
        humanRepository.save(humanDTO.toHuman());
    }
//
//    public Human findTopLocation() {
//        var a = Stream.of(humanRepository).collect(Collectors.groupingBy(Human::getLocation));
//    }

//
//    public String findFirstByLocation(String location) {
//        return humanRepository.findTop1ByLocation(location);
//    }

}

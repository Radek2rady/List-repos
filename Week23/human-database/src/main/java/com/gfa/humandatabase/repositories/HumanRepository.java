package com.gfa.humandatabase.repositories;

import com.gfa.humandatabase.models.Human;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HumanRepository extends CrudRepository<Human, Long> {
    List<Human> findAllByLocation(String location);

    List<Human> findAll();

    @Query("SELECT AVG(h.age) from Human h")
    int getAverageAge();

    //    @Query(value = "select h from Human where gender = 'male'")
//    @Query("select h from Human h where h.gender = 'male'")
//    List<Human> maleGender();

//    List<Human> findAllByGender(String gender);

//    List<Human> findTopByLocation

//    List<Human> findAllGender(String gender);
}

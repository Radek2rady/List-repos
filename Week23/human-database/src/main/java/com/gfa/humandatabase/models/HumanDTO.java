package com.gfa.humandatabase.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HumanDTO {
    private String firstName;
    private String lastName;
    private long age;
    private String gender;
    private String location;

    public Human toHuman() {
        return new Human(firstName, lastName, age, gender, location);
    }
}

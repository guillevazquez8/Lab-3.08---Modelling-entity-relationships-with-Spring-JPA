package com.example.lab308.activity2;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Conference extends Event {

    @OneToMany(mappedBy = "conference")
    Set<Speaker> speakers = new HashSet<Speaker>();

}

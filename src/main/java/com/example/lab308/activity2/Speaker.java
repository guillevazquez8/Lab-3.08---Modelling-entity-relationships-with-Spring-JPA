package com.example.lab308.activity2;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Speaker {

    @ManyToOne
    @JoinColumn(name="conference_id", nullable = false)
    private Conference conference;

}

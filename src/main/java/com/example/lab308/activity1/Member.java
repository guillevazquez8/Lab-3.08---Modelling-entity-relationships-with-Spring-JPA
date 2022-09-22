package com.example.lab308.activity1;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private Status status;

    private LocalDate renewalDate;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="chapter_id")
    private Chapter chapter;

    public Member() {
    }

    public Chapter getChapter() {
        return chapter;
    }

    public void setChapter(Chapter chapter) {
        this.chapter = chapter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LocalDate getRenewalDate() {
        return renewalDate;
    }

    public void setRenewalDate(LocalDate renewalDate) {
        this.renewalDate = renewalDate;
    }
}

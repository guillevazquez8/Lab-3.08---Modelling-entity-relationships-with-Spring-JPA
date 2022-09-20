package com.example.lab308.activity1.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Chapter {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;

    private Integer district;

    @OneToOne
    @JoinColumn(name="member_id", nullable = false)
    private Member president;

    @OneToMany(mappedBy = "chapter")
    private Set<Member> members = new HashSet<Member>();

    public Chapter(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDistrict() {
        return district;
    }

    public void setDistrict(Integer district) {
        this.district = district;
    }

    public Member getPresident() {
        return president;
    }

    public void setPresident(Member president) {
        this.president = president;
    }

    public Set<Member> getMembers() {
        return members;
    }

    public void setMembers(Set<Member> members) {
        this.members = members;
    }
}

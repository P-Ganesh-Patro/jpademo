package com.jpa.Model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "programmer_dept")
public class ProgrammerDeptModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @ElementCollection
    @CollectionTable(name = "programmer_skills", joinColumns = @JoinColumn(name = "programmer_id"))
    private Set<String> skills = new HashSet<>();

    public ProgrammerDeptModel() {
    }

    public ProgrammerDeptModel(String name, Set<String> skills) {
        this.name = name;
        this.skills = skills;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Set<String> getSkills() {
        return skills;
    }

    @Override
    public String toString() {
        return "ProgrammerDeptModel [id=" + id + ", name=" + name + ", skills=" + skills + "]";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSkills(Set<String> skills) {
        this.skills = skills;
    }

}

package com.jpa.Model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class PanchaCafeModel {

    @EmbeddedId
    private EmployeesModel id;

    private String name;

    public PanchaCafeModel(EmployeesModel id, String name) {
        this.id = id;
        this.name = name;
    }

    public PanchaCafeModel() {
    }

    @Override
    public String toString() {
        return "PanchaCafeModel [id=" + id + ", name=" + name + "]";
    }

}

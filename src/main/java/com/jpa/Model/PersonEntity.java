package com.jpa.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Person")
public class PersonEntity {

    @Id
    private Long id;
    private String name;

    @OneToOne
    @JoinColumn(name = "passport_id")
    private PassportEntity passport;

    public PersonEntity(Long id, String name, PassportEntity passport) {
        this.id = id;
        this.name = name;
        this.passport = passport;
    }

    public PersonEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PassportEntity getPassport() {
        return passport;
    }

    public void setPassport(PassportEntity passport) {
        this.passport = passport;
    }

}

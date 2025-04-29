package com.jpa.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Passport")
public class PassportEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = true)
    private String passPortNumber;

    public PassportEntity() {
    }

    public PassportEntity(String passPortNumber) {

        this.passPortNumber = passPortNumber;
    }

    public String getPassPortNumber() {
        return passPortNumber;
    }

    public void setPassPortNumber(String passPortNumber) {
        this.passPortNumber = passPortNumber;
    }

}

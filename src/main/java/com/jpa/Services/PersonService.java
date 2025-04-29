package com.jpa.Services;

import com.jpa.Model.PersonEntity;
import com.jpa.input.InputReader;

import jakarta.persistence.EntityManager;

public class PersonService {
    PersonEntity pe = new PersonEntity();

    public void persistThePerson(EntityManager em) {
        InputReader ir = new InputReader();
        if (pe != null) {
            em.getTransaction().begin();
            em.persist(ir.createPerson());
            em.getTransaction().commit();
        } else {
            System.err.println("i did not found the pe");
        }
        em.close();

    }

}

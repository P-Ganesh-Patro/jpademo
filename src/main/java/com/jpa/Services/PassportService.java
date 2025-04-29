package com.jpa.Services;

import com.jpa.input.InputReader;

import jakarta.persistence.EntityManager;
import com.jpa.Model.*;

public class PassportService {
    PassportEntity ppe = new PassportEntity();

    public void persistThePassport(EntityManager em) {
        InputReader ir = new InputReader();
        if (ppe != null) {
            // em.getTransaction().begin();
            em.persist(ir.createPassport());
            // em.getTransaction().commit();
            System.out.println("Passport details saved..");
        } else {
            System.out.println("passport number not saved.. due to ppe is not assigned..");
        }
        em.close();
    }

}

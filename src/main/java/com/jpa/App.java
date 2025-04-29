package com.jpa;

import com.jpa.Services.PassportService;
import com.jpa.Services.PersonService;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class App {
    public static void main(String[] args) {
        EntityTransaction et = null;
        try (EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver");
                EntityManager em = emf.createEntityManager()) {
            PassportService pps = new PassportService();
            PersonService ps = new PersonService();
            et = em.getTransaction();
            et.begin();
            pps.persistThePassport(em);
            ps.persistThePerson(em);
            et.commit();
        } catch (Exception e) {
            if (et != null && et.isActive()) {
                et.rollback();
            }
            System.out.println("Error:- " + e.getMessage());
            e.printStackTrace();
        }
    }
}

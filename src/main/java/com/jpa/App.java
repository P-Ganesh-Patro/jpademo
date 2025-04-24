package com.jpa;

import com.jpa.Services.ProgrammerDeptService;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class App {
    public static void main(String[] args) {
        EntityTransaction et = null;

        try (EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver");
                EntityManager em = emf.createEntityManager()) {

            et = em.getTransaction();
            et.begin();

            ProgrammerDeptService pds = new ProgrammerDeptService();
            pds.saveProgammersList();

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

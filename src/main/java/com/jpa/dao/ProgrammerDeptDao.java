package com.jpa.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import com.jpa.Model.ProgrammerDeptModel;

public class ProgrammerDeptDao {
    public void persistTheProgrammerSkills(ProgrammerDeptModel pdm){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(pdm);
        em.getTransaction().commit();
        System.out.println("data saved..");

    }

    
}

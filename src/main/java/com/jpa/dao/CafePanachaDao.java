package com.jpa.dao;

import com.jpa.Model.PanchaCafeModel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class CafePanachaDao {

    
    public void persistCafePancha(PanchaCafeModel pcm) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver");

        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(pcm);
        em.getTransaction().commit();
        System.out.println("employee data saved..");
        em.close();
        emf.close();

    }

}

package com.jpa.Services;

import com.jpa.Model.Category;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.PostPersist;
import jakarta.persistence.PrePersist;

public class CategoryService {
    // CategoryService cs = new CategoryService();
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver");

    public void createCategory(Category category) {
        EntityManager em = emf.createEntityManager();
        // cs.beforeSave();
        em.getTransaction().begin();
        em.persist(category);
        em.getTransaction().commit();
        // cs.afterSave();
        System.out.println("data inserted...");
        em.close();
    }

    public Category getCategory(String catcode) {
        EntityManager em = emf.createEntityManager();
        Category category = em.find(Category.class, catcode);
        em.close();
        System.out.println(category);
        return category;
    }

    public void updateCategory(String catcode) {
        EntityManager em = emf.createEntityManager();
        Category category = em.find(Category.class, catcode);
        if (category != null) {
            em.getTransaction().begin();
            category.setDescription("indian sci.com");
            em.getTransaction().commit();
        }
        System.out.println("category updated..");
        em.close();
    }

    public void DeleteCategory(String catcode) {
        EntityManager em = emf.createEntityManager();
        Category category = em.find(Category.class, catcode);
        if (category != null) {
            em.getTransaction().begin();
            em.remove(category);
            em.getTransaction().commit();
        }
        System.out.println("category deleted..");

        em.close();
    }


    @PrePersist
    public void beforeSave(){
        System.out.println("before persisting the category:- " + this.toString());
    }
    @PostPersist
    public void afterSave(){
        System.out.println("after persisting the category:- " + this.toString());
    }


    public void close() {
        emf.close();
    }

}
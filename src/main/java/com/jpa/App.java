package com.jpa;

import com.jpa.Services.EmployeeCafePanchaService;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class App {
    public static void main(String[] args) {
        try (EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver");
                EntityManager em = emf.createEntityManager();) {

            EmployeeCafePanchaService ecps = new EmployeeCafePanchaService();
            ecps.saveTheCafePancha();

        } catch (Exception e) {
            System.out.println("Error:- " + e.getMessage());
            e.printStackTrace();

        }

    }
}

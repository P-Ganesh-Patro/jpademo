package com.jpa.dao;

import java.util.List;

import com.jpa.Model.StudentJoinDetailsModel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class StudentJoinDetsiailsDAO {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver");

    EntityManager em = emf.createEntityManager();

    public void saveStudentDetails(StudentJoinDetailsModel sjdm) {
        em.getTransaction().begin();
        em.persist(sjdm);
        em.getTransaction().commit();
        System.out.println("Student details Saved Successfully...");
    }

    public void getTheStudentDetailsById(int id) {
        StudentJoinDetailsModel getStd = em.find(StudentJoinDetailsModel.class, id);
        if (getStd != null) {
            System.out.println();
            System.out.println();
            System.out.println(getStd.toString());
            System.out.println();

        } else {
            System.out.println("id not found");
        }

    }

    public void getAllStudentDetails() {
        String sqlString = "select s from StudentJoinDetailsModel s";
        List<StudentJoinDetailsModel> allStdList = em.createQuery(sqlString, StudentJoinDetailsModel.class)
                .getResultList();

            
        for (StudentJoinDetailsModel std : allStdList) {
            System.out.print(std.getName() + " ");
            System.out.print(std.getId() +" ");
            System.out.print(std.getPaidAmount() + " ");
            System.out.print(std.getPendingBalance()+" ");
            System.out.print(std.getTotalFee() + " ");
        }
        em.close();
    }

}

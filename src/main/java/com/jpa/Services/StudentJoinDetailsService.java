package com.jpa.Services;

import com.jpa.dao.StudentJoinDetsiailsDAO;
import com.jpa.input.InputReader;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class StudentJoinDetailsService {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver");
    InputReader ir = new InputReader();

    StudentJoinDetsiailsDAO sjdd = new StudentJoinDetsiailsDAO();

    public void saveStudentJoinDetails() {

        sjdd.saveStudentDetails(ir.readStudentJoinDetails());

    }

    public void getTheStudentDetailsById() {

        sjdd.getTheStudentDetailsById(ir.getStudentById());
    }

    public void getAllStudents() {

        sjdd.getAllStudentDetails();
    }

}

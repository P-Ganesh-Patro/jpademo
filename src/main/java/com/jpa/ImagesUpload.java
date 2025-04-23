package com.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.io.File;
import java.nio.file.Files;

import com.jpa.Model.StudentImage;

public class ImagesUpload {
    public static void main(String[] args) {
        try (EntityManagerFactory emf = Persistence.createEntityManagerFactory("mssqlserver");
                EntityManager em = emf.createEntityManager();) {

            File file = new File("/home/ganeswar/Pictures/Screenshots/Screenshot from 2025-04-22 21-10-04.png");
            byte[] imagesBytes = Files.readAllBytes(file.toPath());
            StudentImage si = new StudentImage();
            si.setImageData(imagesBytes);
            si.setStdName(file.getName());

            em.getTransaction().begin();
            em.persist(si);
            em.getTransaction().commit();
            System.out.println("images uploaded..");

        } catch (Exception e) {
            System.out.println("Error:- " + e.getMessage());
            e.printStackTrace();
        }

    }
}

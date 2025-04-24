package com.jpa.input;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import com.jpa.Model.StudentJoinDetailsModel;
import com.jpa.Model.ProgrammerDeptModel;

public class InputReader {
    public StudentJoinDetailsModel readStudentJoinDetails() {
        try (Scanner in = new Scanner(System.in);) {
            System.out.println("Enter The Student details:-");
            System.out.print("Enter The Student Full Name:- ");
            String studentName = in.nextLine();
            System.out.println("Enter the fee (paid amount):-");
            double paidAmount = in.nextDouble();
            in.nextLine();
            Date joinDate = new Date();
            System.out.println("Enter the Date of Birth:- ('dd-mm-yyyy')");
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            String dobString = in.nextLine();
            Date dobDate = sdf.parse(dobString);
            Calendar dobCalendar = Calendar.getInstance();
            dobCalendar.setTime(dobDate);
            StudentJoinDetailsModel sjdm = new StudentJoinDetailsModel(studentName, paidAmount, joinDate, dobCalendar);
            return sjdm;

        } catch (Exception e) {
            System.out.println("Error:- " + e.getMessage());
            e.printStackTrace();
            return null;

        }

    }

    public int getStudentById() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Student id:- ");
        int id = in.nextInt();
        in.close();
        return id;
    }

    public ProgrammerDeptModel createProgrammerList() {

        try (Scanner in = new Scanner(System.in);) {
            System.out.println("Enter name:- ");
            String name = in.nextLine();
            System.out.println("enter the count of skils");
            int count = in.nextInt();
            in.nextLine();
            System.out.println("enter the skills");
            Set<String> skills = new HashSet<>();
            for (int i = 1; i <= count; i++) {
                String skill = in.nextLine();
                skills.add(skill);
            }
            ProgrammerDeptModel programmer = new ProgrammerDeptModel();
            programmer.setName(name);
            programmer.setSkills(skills);

            return programmer;

        } catch (Exception e) {
            System.out.println("Error in input reader-" + e.getMessage());
            e.printStackTrace();
            return null;

        }

    }

}

package com.jpa.input;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import com.jpa.Model.StudentJoinDetailsModel;

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

}

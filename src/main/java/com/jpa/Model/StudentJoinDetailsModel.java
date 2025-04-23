
package com.jpa.Model;

import java.util.Calendar;
import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="StudentJoinDetails")
public class StudentJoinDetailsModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(length = 255)
    private String name;
    private double totalFee = 50000.00;
    private double paidAmount;
    private double PendingBalance = totalFee - paidAmount;
    private String feeClear ;
    @Temporal(TemporalType.TIMESTAMP)
    private Date joinDate;
    @Temporal(TemporalType.DATE)
    private Calendar DOB;

    public StudentJoinDetailsModel() {
    }

    public StudentJoinDetailsModel(String name, double paidAmount, Date joinDate, Calendar DOB) {
        this.name = name;
        this.joinDate = joinDate;
        this.paidAmount = paidAmount;
        this.DOB = DOB;
        this.PendingBalance = this.totalFee - this.paidAmount;
        this.feeClear = (this.PendingBalance == 0 ? "Clear" : "pending");
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getTotalFee() {
        return totalFee;
    }

    public double getPaidAmount() {
        return paidAmount;
    }

    public double getPendingBalance() {
        return PendingBalance;
    }

    public String isFeeClear() {
        return feeClear;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public Calendar getDOB() {
        return DOB;
    }

    @Override
    public String toString() {
        return "StudentJoinDetailsModel [id=" + id + ", name=" + name + ", totalFee=" + totalFee + ", paidAmount="
                + paidAmount + ", PendingBalance=" + PendingBalance + ", feeClear=" + feeClear + ", joinDate="
                + joinDate + ", DOB=" + DOB + "]";
    }

}
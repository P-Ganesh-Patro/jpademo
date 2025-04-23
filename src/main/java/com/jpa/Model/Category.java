package com.jpa.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
// import jakarta.persistence.Transient;

@Entity
@Table(name = "categories")
public class Category {
    @Column(name = "catcode")
    private String code;

    @Column(name = "catdesc", nullable = true, length = 30, unique = true, updatable = false, insertable = true)
    private String description;

    @Column(name = "fullname")
    // @Transient
    private String fullName;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cat_seq")
    @SequenceGenerator(name = "cat_seq", sequenceName = "category_seq", allocationSize = 1)
    private int catId;


    public Category(String code, String description, String fullName) {
        this.code = code;
        this.description = description;
        this.fullName = fullName;
    }

    public int getCatId() {
        return catId;
    }

    public void setCatId(int catId) {
        this.catId = catId;
    }
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Category [code=" + code + ", description=" + description + ", fullName=" + fullName + ", catId=" + catId
                + "]";
    }

   

}

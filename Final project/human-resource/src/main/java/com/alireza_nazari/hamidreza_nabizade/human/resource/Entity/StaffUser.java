package com.alireza_nazari.hamidreza_nabizade.human.resource.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class StaffUser {
    @Id
    private int id ;
    private String firstName ;
    private String lastName ;
    private String nationalCode ;
    private int age;
    private long phoneNumber ;
    private String email ;
    private String bornCity;

    public StaffUser(String firstName, String lastName, String nationalCode, int age, long phoneNumber, String email, String bornCity) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalCode = nationalCode;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.bornCity = bornCity;
    }

    public StaffUser() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBornCity() {
        return bornCity;
    }

    public void setBornCity(String bornCity) {
        this.bornCity = bornCity;
    }



}

package com.alireza_nazari.hamidreza_nabizade.human.resource.Entity;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
public class Employee {
    @Id
    private int id ;
    @ManyToOne
    @JoinColumn
    private Department department;
    @OneToOne
    @JoinColumn
    private StaffUser staffUser;
    private String project ;
    private String jobRule ;
    private String teamLeadName;
    private int yearExperience ;
    private String level ;
    private Date entranceDate ;

    public Employee() {

    }

    public Employee(Department department, String project, String jobRule, String teamLeadName, int yearExperience, String level, Date entranceDate) {
        this.department = department;
        this.project = project;
        this.jobRule = jobRule;
        this.teamLeadName = teamLeadName;
        this.yearExperience = yearExperience;
        this.level = level;
        this.entranceDate = entranceDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getJobRule() {
        return jobRule;
    }

    public void setJobRule(String jobRule) {
        this.jobRule = jobRule;
    }

    public String getTeamLeadName() {
        return teamLeadName;
    }

    public void setTeamLeadName(String teamLeadName) {
        this.teamLeadName = teamLeadName;
    }

    public int getYearExperience() {
        return yearExperience;
    }

    public void setYearExperience(int yearExperience) {
        this.yearExperience = yearExperience;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Date getEntranceDate() {
        return entranceDate;
    }

    public void setEntranceDate(Date entranceDate) {
        this.entranceDate = entranceDate;
    }
}

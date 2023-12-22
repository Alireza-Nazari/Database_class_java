package com.alireza_nazari.hamidreza_nabizade.human.resource.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Projects {
    @Id
    private int id;
    private int projectLevel;
    private String name;
    private int projectDuration;

    public Projects(){

    }
    public Projects(int projectLevel, String name, int projectDuration) {
        this.projectLevel = projectLevel;
        this.name = name;
        this.projectDuration = projectDuration;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProjectLevel() {
        return projectLevel;
    }

    public void setProjectLevel(int projectLevel) {
        this.projectLevel = projectLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProjectDuration() {
        return projectDuration;
    }

    public void setProjectDuration(int projectDuration) {
        this.projectDuration = projectDuration;
    }
}

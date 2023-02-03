package com.firstSpringApp.SpringAppBasics;

public class Details {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getRole() {
        return role;
    }

    private String role;

    public Details(String name, int age, String role) {
        this.name = name;
        this.age = age;
        this.role = role;
    }
}

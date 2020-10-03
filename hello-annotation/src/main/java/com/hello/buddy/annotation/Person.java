package com.hello.buddy.annotation;

public class Person {

    private String name;
    private RoleType role;

    public Person(String name, RoleType role) {
        this.name = name;
        this.role = role;
    }

    public RoleType getRole() {
        return role;
    }

    public void setRole(RoleType role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

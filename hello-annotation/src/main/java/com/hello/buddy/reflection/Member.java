package com.hello.buddy.reflection;

public class Member {

    private String name;

    public Member() {
        this.name = "Ford";
    }

    public Member(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("Name Of Member : " + name);
    }

    public void printAge(int age) {
        System.out.println("Age Of Member : " + age);
    }

    private void generateIdentifier() {
        System.out.println("Private method to generate Identifier");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

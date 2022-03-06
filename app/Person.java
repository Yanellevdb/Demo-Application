package com.example.demoapplication;

public class Person {
    String firstName, lastName;

    Person (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }♦

    public String getFirstName() {
        return this.firstName;
    }

    public String getName() {
        return String.format("%s %s", this.firstName, this.lastName);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
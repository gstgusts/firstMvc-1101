package com.example.data;

public class Person extends ItemWithIdBase {
    private String name;
    private String surname;

    public Person(int id, String name, String surname) {
        super(id);
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
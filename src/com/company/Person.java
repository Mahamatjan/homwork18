package com.company;

public class Person {
    private String name;

    public Person(String name){
        this.name = name;
    }

    public String getName() {
        System.out.println(name);
        return name;
    }
}

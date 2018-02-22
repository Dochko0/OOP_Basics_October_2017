package com.company.SortPersonByNameAndAge;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String s, String s1, int i) {
        this.firstName=s;
        this.lastName=s1;
        this.age=i;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return String.format("%s %s is %d years old.", this.getFirstName(),this.lastName,this.age);
    }
}

package com.company.Salary;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String s, String s1, int i, double salary) {
        this.firstName = s;
        this.lastName = s1;
        this.age = i;
        this.salary = salary;
    }

    void increaseSalary(double bonus) {
        if (this.age < 30) {
            bonus = bonus / 2;
        }
        this.salary += this.salary * bonus / 100;
    }

    @Override
    public String toString() {
        return String.format("%s %s gets %s leva", this.firstName, this.lastName, this.salary);
    }


}

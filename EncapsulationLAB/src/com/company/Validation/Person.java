package com.company.Validation;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
        this.setSalary(salary);
    }

    public void setSalary(double salary) {
        if (salary < 460) {
            throw new IllegalArgumentException("Salary cannot be less than 460 leva");
        } else {
            this.salary = salary;
        }
    }

    public void setAge(int age) {
        if (age < 1) {
            throw new IllegalArgumentException("Age cannot be zero or negative integer");
        } else {
            this.age = age;
        }
    }

    public void setFirstName(String firstName) {
        if (firstName.length() < 3) {
            throw new IllegalArgumentException("First name cannot be less than 3 symbols");
        } else {
            this.firstName = firstName;
        }
    }

    public void setLastName(String lastName) {
        if (lastName.length() < 3) {
            throw new IllegalArgumentException("Last name cannot be less than 3 symbols");
        } else {
            this.lastName = lastName;
        }
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

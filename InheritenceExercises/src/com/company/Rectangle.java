package com.company;

public class Rectangle {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public void area(){
        System.out.println(this.a*this.b);
    }

    double getA() {
        return a;
    }

    double getB() {
        return b;
    }
}

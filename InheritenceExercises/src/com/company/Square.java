package com.company;

public class Square extends Rectangle{

    public Square(double a, double b) {
        super(a, b);
    }

    @Override
    public void area() {
        System.out.println(super.getA() * super.getA());
    }
}

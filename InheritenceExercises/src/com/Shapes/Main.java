package com.Shapes;

public class Main {
    public static void main(String[] args) {

        Shape rec = new Rectangle(2,5);
        rec.calculateArea();
        rec.calculatePerimeter();
        Shape circle = new Circle(2.44);

        circle.calculateArea();
        circle.calculatePerimeter();

        System.out.println(rec.getPerimeter());

    }
}

package com.Shapes;

public class Circle extends Shape{

    private double radius;



    public Circle(double radius) {
        this.radius = radius;
    }

    public final double getRadius() {
        return this.radius;
    }

    @Override
    protected void calculatePerimeter() {
        super.setPerimeter(2*Math.PI*this.radius);
    }

    @Override
    protected void calculateArea() {
        super.setArea(Math.PI*this.radius*this.radius);
    }
}

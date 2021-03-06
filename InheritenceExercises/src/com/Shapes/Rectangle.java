package com.Shapes;

public class Rectangle extends Shape{

    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public final double getHeight() {
        return this.height;
    }

    public final double getWidth() {
        return this.width;
    }

    @Override
    protected void calculatePerimeter() {
        super.setPerimeter(2*this.height+2*this.width);
    }

    @Override
    protected void calculateArea() {
        super.setArea(this.height*this.width);
    }
}

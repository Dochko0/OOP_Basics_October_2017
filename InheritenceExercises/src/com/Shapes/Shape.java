package com.Shapes;

public abstract class Shape {

    private double perimeter;
    private double area;


    Shape() {}

    public double getPerimeter() {
        return this.perimeter;
    }

    public double getArea() {
        return this.area;
    }

    void setArea(double area) {
        this.area = area;
    }

    void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    protected abstract void calculatePerimeter();

    protected abstract void calculateArea();



}

package com.goit.gojavaonline.Module4;

public class Circle {

    private double radius;
    private double area;

    Circle(double radius){
        this.radius = radius;
        area = Math.PI*radius*radius;
    }

    public double getRadius() {
        return radius;
    }


    public double getArea() {
        return area;
    }
}

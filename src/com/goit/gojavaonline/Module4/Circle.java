package com.goit.gojavaonline.Module4;

public class Circle {

    private double area;

    Circle(double radius){
        area = Math.PI*radius*radius;

    }

    public double getArea() {
        return area;
    }
}

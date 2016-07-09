package com.goit.gojavaonline.Module4;

public class Circle {

    private int radius;
    private double areaOfCircle;

    Circle(int radius){
        this.radius = radius;
        areaOfCircle = Math.PI*radius*radius;

    }

    public double getAreaOfCircle() {
        return areaOfCircle;
    }
}

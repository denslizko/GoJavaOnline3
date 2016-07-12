package com.goit.gojavaonline.Module4;


class Rectangle {

    private double sideA;
    private double sideB;
    private double area;

    Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
        area = sideA * sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    double getArea() {
        return area;
    }
}

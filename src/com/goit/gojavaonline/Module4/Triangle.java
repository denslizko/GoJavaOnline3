package com.goit.gojavaonline.Module4;


class Triangle {

    private double sideA;
    private double sideB;
    private double sideC;
    private double halfPerimeter;
    private double area;

    Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        halfPerimeter = (sideA + sideB + sideC) / 2;
        area = Math.sqrt(halfPerimeter * (halfPerimeter - sideA) * (halfPerimeter - sideB) * (halfPerimeter - sideC));
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public double getHalfPerimeter() {
        return halfPerimeter;
    }

    public double getArea() {
        return area;
    }
}

package com.goit.gojavaonline.Module4;


class Triangle {

    private double area;

    Triangle(double sideA, double sideB, double sideC) {
        double halfPerimeter = (sideA + sideB + sideC) / 2;
        area = Math.sqrt(halfPerimeter * (halfPerimeter - sideA) * (halfPerimeter - sideB) * (halfPerimeter - sideC));
    }

    public double getArea() {
        return area;
    }
}

package com.goit.gojavaonline.Module4;


public class Triangle {

    private int sideA;
    private int sideB;
    private int sideC;
    private int Unknown;
    private double areaOfTriangle;

    Triangle(int sideA, int sideB, int sideC){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        Unknown = (sideA+sideB+sideC)/2;
        areaOfTriangle = Math.sqrt(Unknown *(Unknown-sideA)*(Unknown-sideB)*(Unknown-sideC));
    }

    public double getAreaOfTriangle() {
        return areaOfTriangle;
    }
}

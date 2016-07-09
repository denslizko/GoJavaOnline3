package com.goit.gojavaonline.Module4;


public class Rectangle {
    int sideA;
    int sideB;
    private int areaOfRectangle;

    Rectangle(int sideA, int sideB){
        this.sideA=sideA;
        this.sideB=sideB;
        areaOfRectangle=sideA*sideB;
    }

    public int getAreaOfRectangle() {
        return areaOfRectangle;
    }
}

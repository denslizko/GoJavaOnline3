package com.goit.gojavaonline.Module4;

public class Runner {
    public static void main(String[] args) {

        Triangle triangle = new Triangle(10,10,10);
        System.out.println("Area of triangle = " + triangle.getAreaOfTriangle());

        Rectangle rectangle = new Rectangle(10,20);
        System.out.println("Area of rectangle = " + rectangle.getAreaOfRectangle());

        Circle circle = new Circle(20);
        System.out.println("Area of circle = " + circle.getAreaOfCircle());




    }
}

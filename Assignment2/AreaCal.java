package com.Assignment2;

public class AreaCal {
    public double calculateArea(int side){
        return side*side;
    }

    public double calculateArea(double length, double breadth){
        return length*breadth;
    }

    public double calculateArea(double radius){
        return Math.PI*radius*radius;
    }

    public static void main(String[] args) {
        AreaCal calculator = new AreaCal();
        double squareArea = calculator.calculateArea(5.0);
        System.out.println("Area of square: "+ squareArea);
        double rectangleArea = calculator.calculateArea(4.0,6.0);
        System.out.println("Area of Rectangle: "+ rectangleArea);
        double circleArea = calculator.calculateArea(3.0);
        System.out.println("Area of circle: "+ circleArea);
    }
}

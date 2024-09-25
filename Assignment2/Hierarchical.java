package com.Assignment2;

class Shape {
    public double area() {
        return 0; // Default area for a generic shape
    }
}

// Derived class Circle that inherits from Shape
class Circle extends Shape {
    private double radius;

    // Constructor for Circle
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor for Rectangle
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Overriding the area method from Shape class
    @Override
    public double area() {
        return length * width; // Area of rectangle = length * width
    }
}

// Main class to demonstrate hierarchical inheritance
public class Hierarchical{
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        System.out.println("Area of Circle: " + circle.area());

        // Creating an instance of Rectangle
        Shape rectangle = new Rectangle(4.0, 6.0);
        System.out.println("Area of Rectangle: " + rectangle.area());
    }
}

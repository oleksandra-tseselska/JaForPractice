package com.example.jaformpractice.shapes;

public class Circle implements IShape, IRound{
    private Double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }
}

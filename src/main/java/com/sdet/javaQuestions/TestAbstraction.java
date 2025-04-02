package com.sdet.javaQuestions;

abstract class AbstarctionExample {
    abstract  double area();
    public void dispalyArea(){
        System.out.println(" Area: " +area());
    }
}

class Circle extends AbstarctionExample{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends AbstarctionExample{
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length*width;
    }
}
public  class TestAbstraction{
    public static void main(String[] args) {
        AbstarctionExample circle = new Circle(5.0);

        AbstarctionExample rectangle = new Rectangle(20,20);

        circle.dispalyArea();
        rectangle.dispalyArea();
    }




}
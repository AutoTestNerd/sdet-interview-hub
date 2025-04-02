package com.sdet.javaQuestions;

public interface TestAbstractionUsingInterface {
     double area();
    default void displayarea(){
        System.out.println("Area :" +area());
    }
}

class Circle1 implements TestAbstractionUsingInterface{
 private double radius;

    public Circle1(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius*radius;
    }
}
class Rectangle1 implements TestAbstractionUsingInterface{
    private double length;
    private double width;

    public Rectangle1(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length *width;
    }
}
/*

How Abstraction Works with Interfaces:
Interface Shape:

Declares the abstract method area().

Provides a default method displayArea() (avoids forcing all subclasses to reimplement it).

Implementing Classes (Circle, Rectangle):

Must implement area() (the interface’s contract).

Inherit the displayArea() method from the interface.

User Interaction:

Call displayArea() without knowing how area() is calculated.
 */
class testInterface {
    public static void main(String[] args) {
        TestAbstractionUsingInterface cir = new Circle1(5.0);
        TestAbstractionUsingInterface  rec = new Rectangle1(45.0,56.0);
        cir.displayarea();
        rec.displayarea();
    }
}

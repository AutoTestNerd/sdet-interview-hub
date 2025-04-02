package com.sdet.javaQuestions;

public interface MultipleAbstraction {

    void sound();
}

interface Animal {
    void eat();
}

class Dog implements MultipleAbstraction ,Animal{

    @Override
    public void sound() {
        System.out.println("Barking ------ >");
    }

    @Override
    public void eat() {
        System.out.println("Eating Food");
    }
}

 class TestMultipleAbstraction {
    public static void main(String[] args) {
        Dog mydog = new Dog();
        mydog.eat();
        mydog.sound();
    }
}
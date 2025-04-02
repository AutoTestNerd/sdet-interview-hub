package com.sdet.javaQuestions;

public class MethodOveriding {

    void AnimalSound(){
        System.out.println("Animal Barking");
    }
}

class cat extends MethodOveriding{

    @Override
    void AnimalSound() {
        System.out.println("Meow meow");
    }
}

class testOverriding{
    public static void main(String[] args) {
        MethodOveriding test = new cat();
        test.AnimalSound();// Calls overridden method in Cat
    }
}
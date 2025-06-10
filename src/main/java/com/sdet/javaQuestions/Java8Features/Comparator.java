package com.sdet.javaQuestions.Java8Features;

class Comparator {
    int rollNo;
    String name;

    Comparator(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString() {
        return rollNo + " - " + name;
    }
}
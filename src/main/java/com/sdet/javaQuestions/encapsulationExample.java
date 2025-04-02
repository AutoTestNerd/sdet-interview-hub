package com.sdet.javaQuestions;

public class encapsulationExample {

    private String name;
    private int salary;

    //  create constructor

    public encapsulationExample(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    // create setter and getter


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        encapsulationExample encaps = new encapsulationExample("Manish", 2000);
        System.out.println(encaps.getName()+  "  and " + encaps.getSalary());
        encaps.setName("Kumar");
        encaps.setSalary(1000);
        System.out.println(encaps.getName()+  "  and " + encaps.getSalary());

    }
}

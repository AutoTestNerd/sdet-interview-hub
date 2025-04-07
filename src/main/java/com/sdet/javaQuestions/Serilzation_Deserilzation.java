package com.sdet.javaQuestions;

import java.io.*;

public class Serilzation_Deserilzation implements Serializable {
    private String name;
    private int age;

    public Serilzation_Deserilzation(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

//Serialize Object to File

class SerlizableDemo{
    SerlizableDemo() throws IOException {
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Serilzation_Deserilzation user = new Serilzation_Deserilzation("manish" ,34);

        FileOutputStream fileout = new FileOutputStream("Serilzation_Deserilzation.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileout);
        out.writeObject(user);//seriizaing the object
out.close();
fileout.close();
System.out.println("Object serialized");

//Deserilzed

        FileInputStream file = new FileInputStream("Serilzation_Deserilzation.ser");
        ObjectInputStream op = new ObjectInputStream(file);
        Serilzation_Deserilzation user1 = (Serilzation_Deserilzation) op.readObject();
        op.close();
        file.close();
        System.out.println("User name: " + user1);

        }




    }

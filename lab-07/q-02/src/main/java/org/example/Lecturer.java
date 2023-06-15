package org.example;

public class Lecturer implements Speaker {
    @Override
    public void speak() {
        System.out.println("Lecturer says, Listen students....");
    }
}

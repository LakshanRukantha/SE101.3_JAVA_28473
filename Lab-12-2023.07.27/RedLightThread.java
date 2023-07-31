package org.example;

public class RedLightThread extends Thread{
    TrafficLight tl;
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    public void run(){
       tl.TrafficLight(ANSI_RED + "🔴 Red Lighted Up" + ANSI_RESET, 5000);
    }
}

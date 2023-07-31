package org.example;

public class GreenLightThread extends Thread{
    TrafficLight tl;
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";

    public void run(){
        tl.TrafficLight(ANSI_GREEN + "🟢 Green Lighted Up" + ANSI_RESET, 10000);
    }
}

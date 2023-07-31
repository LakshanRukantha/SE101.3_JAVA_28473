package org.example;

public class YellowLightThread extends Thread{
    TrafficLight tl;
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    public void run(){
        tl.TrafficLight(ANSI_YELLOW + "🟡 Yellow Lighted Up" + ANSI_RESET, 10000);
    }
}

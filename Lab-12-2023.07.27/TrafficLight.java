package org.example;

public class TrafficLight {
    synchronized void TrafficLight(String message, int sleepTime){
        while(true){
            System.out.println(message);
            try{
                Thread.sleep(sleepTime);
            }catch(InterruptedException e){
                System.out.println(e.getMessage());
                return;
            }
        }
    }
}

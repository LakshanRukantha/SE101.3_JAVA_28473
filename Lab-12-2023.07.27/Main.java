package org.example;

public class Main {
    public static void main(String[] args) {
        RedLightThread rlt = new RedLightThread();
        GreenLightThread glt = new GreenLightThread();
        YellowLightThread ylt = new YellowLightThread();

        Thread rlt1 = new Thread(rlt);
        Thread glt1 = new Thread(glt);
        Thread ylt1 = new Thread(ylt);

        rlt1.start();
        glt1.start();
        ylt1.start();

    }
}
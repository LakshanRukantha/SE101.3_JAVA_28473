package com.mycompany.Labshhet10questionQ2;


public class JumpingPlayer extends Movements
        {
    int sp;
    
    public JumpingPlayer(int sp)
    {
        this.sp=sp;
    }
    
    public void up()
    {
        System.out.println("Player moved up by "+sp+" spaces");
    }
    
    
    public void down()
    {
        System.out.println("Player moved down by "+sp+" spaces");
    }
    
    
    public void right()
    {
        System.out.println("Player moved right by "+sp+" spaces");
    }
    
    
    public void left()
    {
        System.out.println("Player moved left by "+sp+" spaces");
    }
    
    public void crounchDown()
    {
        System.out.println("Player moved down by "+(sp-3)+" spaces");
    }
    
    public void crounchUp()
    {
        System.out.println("Player moved up by "+(sp-3)+" spaces");
    }
}

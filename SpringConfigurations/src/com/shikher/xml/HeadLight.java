package com.shikher.xml;

/**
 * Created by shikher on 28-Aug-16.
 */
public class HeadLight implements Light {
    @Override
    public void turnOn() {
        System.out.println("Headlight turned on");
    }

    @Override
    public void tunrOff() {
        System.out.println("Headlight turned off");
    }
}

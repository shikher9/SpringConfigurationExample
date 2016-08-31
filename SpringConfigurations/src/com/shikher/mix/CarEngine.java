package com.shikher.mix;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by shikher on 28-Aug-16.
 */

public class CarEngine implements Engine {

    @Override
    public void turnOn() {
        System.out.println("Car engine turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Car engine turned off");
    }
}

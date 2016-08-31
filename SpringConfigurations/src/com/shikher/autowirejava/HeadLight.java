package com.shikher.autowirejava;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by shikher on 28-Aug-16.
 */

@Component
@Scope("prototype")
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

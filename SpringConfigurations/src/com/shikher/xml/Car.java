package com.shikher.xml;

/**
 * Created by shikher on 28-Aug-16.
 */
public class Car implements Vehicle {



    private Engine carEngine;
    private Light headLight;

    public Car(Engine carEngine) {
        this.carEngine = carEngine;
    }

    @Override
    public void start() {
        carEngine.turnOn();
        headLight.turnOn();
        System.out.println("Car is starting");
    }

    @Override
    public void move() {
        System.out.println("Car is moving");
    }

    public Light getHeadLight() {
        return headLight;
    }

    public void setHeadLight(Light headLight) {
        this.headLight = headLight;
    }
}

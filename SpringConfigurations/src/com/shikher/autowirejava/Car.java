package com.shikher.autowirejava;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by shikher on 28-Aug-16.
 */
public class Car implements Vehicle {


    @Autowired
    private Engine carEngine;

    @Autowired
    private Light headLight;


    public Car() {

    }

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

    public Engine getCarEngine() {
        return carEngine;
    }

    public void setCarEngine(Engine carEngine) {
        this.carEngine = carEngine;
    }
}

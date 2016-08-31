package com.shikher.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by shikher on 28-Aug-16.
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");

        System.out.println("Spring with XML Configuration");

        //normal way without DI
        //Car car = new Car(new CarEngine());

        Car car = applicationContext.getBean("car", Car.class);
        car.start();
        Thread.sleep(3000);
        car.move();
    }
}

package com.shikher.java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by shikher on 28-Aug-16.
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppContext.class);

        //normal way without DI
        //Car car = new Car(new CarEngine());

        System.out.println("Spring with Java Configuration");

        Car car = applicationContext.getBean("car", Car.class);
        car.start();
        Thread.sleep(3000);
        car.move();
    }
}

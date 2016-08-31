package com.shikher.java;

import com.shikher.xml.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by shikher on 28-Aug-16.
 */

@Configuration
public class AppContext {

    @Bean(name = "carEngine")
    public Engine getCarEngine() {
        return new CarEngine();
    }

    @Bean(name = "headLight")
    public Light getLight() {
        return new HeadLight();
    }

    @Bean(name = "car")
    public Car getCar() {
        Car car = new Car(getCarEngine());
        car.setHeadLight(getLight());
        return car;
    }

}

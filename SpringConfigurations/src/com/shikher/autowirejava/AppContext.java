package com.shikher.autowirejava;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Created by shikher on 28-Aug-16.
 */

@Configuration
@ComponentScan({"com.shikher.autowirejava"})
public class AppContext {


    /**
     * Car bean with prototype scope (default is singleton)
     *
     * @return Car bean
     */

    @Bean(name = "car")
    @Scope("prototype")
    public Car getCar() {
        return new Car();
    }

}

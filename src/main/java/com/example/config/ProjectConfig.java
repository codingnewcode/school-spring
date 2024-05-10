package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    Vehicle vehicle() {
        var veh = new Vehicle();
        veh.setName("Audi 8");
        return veh;
    }

    /* Method naming usually follows verbs notation such as sayHello(), getNumber(), but for methods that
    create beans, names can be used according to the lesson as these names will become bean names in the context
    according to the lesson.
    */

    @Bean
    String hello() {
        return "Hello world";
    }

    @Bean
    Integer number() {
        return 16;
    }
}

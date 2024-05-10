package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    /*Vehicle vehicle() {
        var veh = new Vehicle();
        veh.setName("Audi 8");
        return veh;
    }
    */

    /* Method naming usually follows verbs notation such as sayHello(), getNumber(), but for methods that
    create beans, names can be used according to the lesson as these names will become bean names in the context
    according to the lesson.
    */

    /*@Bean
    String hello() {
        return "Hello world";
    }

    @Bean
    Integer number() {
        return 16;
    }
    */

    @Bean
    Vehicle vehicle1() {
        var veh = new Vehicle();
        veh.setName("Audi R8");
        return veh;
    }

    @Bean
    Vehicle vehicle2() {
        var veh = new Vehicle();
        veh.setName("Honda Civic");
        return veh;
    }

    @Bean
    Vehicle vehicle3() {
        var veh = new Vehicle();
        veh.setName("Ferrari F50");
        return veh;
    }
}

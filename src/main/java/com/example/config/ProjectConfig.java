package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
// to use the @Component annotation on top of the pojo class (vehicle in this case), we also need to
// specify in config (here) where the @Component classes are located in this example the Vehicle
// @Component class is located in the package=+- folder "com.example.beans") in order to use this
// class as a Bean in the main method.
// This is done for performance issues, it would consume/cost too much resources to always sca at startup
// all packages for @Component annotations, would be very slow, so its up to the developer to add where
// = which packages to scan in search of @Component (with this i assume default would be that even
// @Component classes that are not listed with a @ComponentScan package that indicates their location
// (package) would not be included in the spring ioc container, again for performance reasons according to
// what the lesson says, and thus if i understand correctly would not be available for object creation
// from a Bean by the spring context, i mean etc.
@ComponentScan(basePackages = "com.example.beans")
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

    /*@Bean
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
    */

    /*@Bean(name="audiVehicle")
    Vehicle vehicle1() {
        var veh = new Vehicle();
        veh.setName("Audi R8");
        return veh;
    }

    @Bean(value="hondaVehicle")
    Vehicle vehicle2() {
        var veh = new Vehicle();
        veh.setName("Honda Civic");
        return veh;
    }

    @Bean("ferrariVehicle")
    Vehicle vehicle3() {
        var veh = new Vehicle();
        veh.setName("Ferrari F50");
        return veh;
    }
    */

    /*@Bean(name="audiVehicle")
    Vehicle vehicle1() {
        var veh = new Vehicle();
        veh.setName("Audi R8");
        return veh;
    }

    //@Primary
    // primary annotation in more than one Bean throws error: cant have 2+ default Beans (that serve
    // in the case where no Bean name is specified in context.getBean in main method, then in this case
    // spring ioc container does not know which is the default one if 2+ i mean etc.)
    @Bean(value="hondaVehicle")
    Vehicle vehicle2() {
        var veh = new Vehicle();
        veh.setName("Honda Civic");
        return veh;
    }

    @Primary
    @Bean("ferrariVehicle")
    Vehicle vehicle3() {
        var veh = new Vehicle();
        veh.setName("Ferrari F50");
        return veh;
    }
    */
}

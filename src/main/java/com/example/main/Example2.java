package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example2 {
    /*
    psvm shortcut name in intellij ("public static void main" method) to create a main method as is said in the lesson,
    i also do it manually here in this case after watching the syntax from the automated one.
    */
    public static void main(String[] args) {
        // Example1
        // example class created without the Spring context
        /*Vehicle vehicle = new Vehicle();
        vehicle.setName("Honda City");
        System.out.println("Vehicle name from non-spring context is: " + vehicle.getName());
        */

        // initialize Spring IOC container, with parameter passed being where the config has been defined, which
        // is in the ProjectConfig.class class, as is said in the lesson, i mean according to the lesson.

        // also the lesson says the 2 types of Spring IoC Containers are BeanFactory and Application Context,
        // as IoC container is the more advanced one we try to use it when possible, but both of these are
        // interfaces not classes, so we cant instanciate them (create an object from them), so we need first
        // to create the actual "objects of implementation classes of those interfaces" as the lesson says i mean,
        // the first being the context object created from the annotationConfigApplicationContext class, that uses
        // annotations to do all the config (@Bean, @Configuration, etc.)

        // also var context line is more compact than:
        // AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        // indeed as the lesson says.

        // in summary this line is responsible for initializing the Spring IoC Container or Spring context as the
        // lesson says.
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        // Vehicle object veh created from the Spring context object, with the parameter passed being the data type
        // in this case Vehicle.class creates indeed a Vehicle veh object as the lesson says.
        /*Vehicle veh = context.getBean(Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + veh.getName());
        */

        // the same also when we try to fetch other Beans from the Spring Context indeed as the lesson says when we
        // fetch them i mean.
        // as the lesson says, these values are also saved in the Spring config class (with the @Bean annotation can be
        // checked indeed as the lesson says i mean).
        /*String hello = context.getBean(String.class);
        System.out.println("String value from Spring Context is: " + hello);
        Integer num = context.getBean(Integer.class);
        System.out.println("Integer value from Spring Context is: " + num);
        */

        // so in summary what i understand from this is the class is created or rather the object (class isntanciation)
        // is created (or rather specified maybe i mean) in the Bean config, and we invoke it in the main method with
        // a new variable

        // Example 2
        // Vehicle object veh created from the Spring context object, with the parameter passed being the data type
        // in this case Vehicle.class creates indeed a Vehicle veh object as the lesson says.
        // also handle no unique bean exception
        /*Vehicle veh1 = context.getBean("vehicle1", Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + veh1.getName());
        Vehicle veh2 = context.getBean("vehicle2", Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + veh2.getName());
        Vehicle veh3 = context.getBean("vehicle3", Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + veh3.getName());
        */

        // Example 3
        /*Vehicle veh1 = context.getBean("audiVehicle", Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + veh1.getName());
        Vehicle veh2 = context.getBean("hondaVehicle", Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + veh2.getName());
        Vehicle veh3 = context.getBean("ferrariVehicle", Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + veh3.getName());
        */

        // Example 4
        /*Vehicle veh0 = context.getBean(Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + veh0.getName());
        Vehicle veh1 = context.getBean("audiVehicle", Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + veh1.getName());
        Vehicle veh2 = context.getBean("hondaVehicle", Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + veh2.getName());
        Vehicle veh3 = context.getBean("ferrariVehicle", Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + veh3.getName());
        Vehicle veh4 = context.getBean(Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + veh4.getName());
         */

        //Example 5
        Vehicle veh = context.getBean(Vehicle.class);
        // this line would return for the name to be null because in this paradigm it's the
        // spring framework that provides the objects values of instance and methods of instance etc,
        // as the lesson says, but i mean which is i think to achieve loose coupling between
        // the different parts of the web application etc as was said in the lesson but is what i think
        // me i mean anyways etc.
        System.out.println("Vehicle name from Spring Context is: " + veh.getName());
        // but this line would work just fine, as it (the "hello" etc) is a fixed constant sort of value
        // specified in the class and not a local value in the instance object.
        veh.printHello();
    }

}

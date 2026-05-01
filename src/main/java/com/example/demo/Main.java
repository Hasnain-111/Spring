package com.example.demo;

import com.example.loose.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        GreetingService greetingService =  context.getBean(GreetingService.class);
        greetingService.sayHello();

        UserService userService = context.getBean(UserService.class);
        userService.notifyUser("hey what's up!");

        UserService userService1 =context.getBean(UserService.class);
        userService1.notifyUser("hello");
    }
}
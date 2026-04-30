package com.example.demo;

import com.example.loose.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationBeanContext.xml");
        GreetingService greetingService = (GreetingService) context.getBean("myBean");
        greetingService.sayHello();
        UserService userService = (UserService) context.getBean("UserServiceEmail");
        userService.notifyUser("hey what's up!");

        UserService userService1 = (UserService) context.getBean("UserServiceSms");
        userService1.notifyUser("helloo");
    }
}

package com.example.demo;

import com.example.loose.NotificationService;
import org.springframework.stereotype.Component;


public class BeanLifeCycle {
    private NotificationService notificationService;

    public BeanLifeCycle(NotificationService notificationService) {
        System.out.println("Constructor Called:");
        this.notificationService = notificationService;
    }

    public void init(){
        System.out.println("@Init : called");
        notificationService.send("Hello from init");
    }
    public void performTask(){
        System.out.println("Ready to use");
    }
    public void cleanUp(){
        System.out.println("CleanUp()");
    }
}

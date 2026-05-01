package com.example.loose;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class EmailNotification implements  NotificationService{

    @Override
    public void send(String message) {
        System.out.println("Email :"+message);
    }
}

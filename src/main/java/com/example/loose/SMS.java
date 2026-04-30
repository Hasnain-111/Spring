package com.example.loose;

public class SMS implements NotificationService{

    @Override
    public void send(String message) {
        System.out.println("SMS"+message);
    }
}

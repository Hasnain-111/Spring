package com.example.loose;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class UserService {
    public NotificationService notificationService;

//    @Autowired
//    public UserService(@Qualifier("emailNotification") NotificationService notificationService) {
//        this.notificationService = notificationService;
//    }
    public UserService( NotificationService notificationService) {
        this.notificationService = notificationService;
    }



    public void notifyUser(String message){
        notificationService.send("notification Hello");

    }
}

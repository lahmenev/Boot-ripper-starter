package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * email : s.lakhmenev@andersenlab.com
 *
 * @author Lakhmenev Sergey
 * @version 1.1
 */
public class ProdNotificationListener implements ApplicationListener<ContextRefreshedEvent> {
    @Autowired
    private NotificationProp notificationProp;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        notificationProp.getMails().forEach(System.out::println);
    }
}

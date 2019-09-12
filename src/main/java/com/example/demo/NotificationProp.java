package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import java.util.List;

/**
 * email : s.lakhmenev@andersenlab.com
 *
 * @author Lakhmenev Sergey
 * @version 1.1
 */
@ConfigurationProperties(prefix = "prod")
public class NotificationProp {
    private List<String> mails;
    private boolean notification;

    public List<String> getMails() {
        return mails;
    }

    public void setMails(List<String> mails) {
        this.mails = mails;
    }

    public boolean isNotification() {
        return notification;
    }

    public void setNotification(boolean notification) {
        this.notification = notification;
    }
}

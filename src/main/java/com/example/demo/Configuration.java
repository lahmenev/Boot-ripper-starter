package com.example.demo;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

/**
 * email : s.lakhmenev@andersenlab.com
 *
 * @author Lakhmenev Sergey
 * @version 1.1
 */
@EnableConfigurationProperties(NotificationProp.class)
public class Configuration {

    @Bean
    @Profile("PROD")
    @ConditionalOnMissingBean(name = "prodNotificationListener")
    @ConditionalOnProperty(name = "prod.notification", matchIfMissing = true, havingValue = "true")
    public ProdNotificationListener prodNotificationListener() {
        return new ProdNotificationListener();
    }
}

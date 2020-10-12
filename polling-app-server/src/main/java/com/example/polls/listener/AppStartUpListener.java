package com.example.polls.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author <a href="mailto:yangbingdong1994@gmail.com">yangbingdong</a>
 * @since
 */
@Component
@Slf4j
public class AppStartUpListener implements ApplicationListener<ApplicationStartedEvent> {
    @Override
    public void onApplicationEvent(ApplicationStartedEvent event) {
        ConfigurableEnvironment environment = event.getApplicationContext().getEnvironment();
        Map<String, Object> systemProperties = environment.getSystemProperties();
        Map<String, Object> systemEnvironment = environment.getSystemEnvironment();
        log.info("Application start up -> systemProperties: {} \n systemEnvironment: {}", systemProperties, systemEnvironment);
    }
}

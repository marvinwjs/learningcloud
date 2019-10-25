package com.learningcloud.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

/**
 * eureka server start
 *
 * @author wuyujian
 * @date 2019-10-12
 * @version 1.0.0
 */
@SpringBootApplication
@EnableEurekaServer
public class LearningCloudEurekaAppliaction {
    public static void main(String[] args) {
        SpringApplication.run(LearningCloudEurekaAppliaction.class, args);
    }
}

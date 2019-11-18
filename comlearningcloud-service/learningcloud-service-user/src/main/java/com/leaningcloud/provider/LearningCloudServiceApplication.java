package com.leaningcloud.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Marvin
 */
@SpringBootApplication
@EnableEurekaClient
public class LearningCloudServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(LearningCloudServiceApplication.class,args);
    }
}

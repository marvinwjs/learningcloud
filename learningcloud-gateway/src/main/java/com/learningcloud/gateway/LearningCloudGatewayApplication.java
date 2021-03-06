package com.learningcloud.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author Marvin
 * @date 2019-10-28 13:20
 * @version 1.0.0
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class LearningCloudGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(LearningCloudGatewayApplication.class, args);
    }
}

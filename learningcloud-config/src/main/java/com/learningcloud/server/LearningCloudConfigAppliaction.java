package com.learningcloud.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * LearningCloud 配置中心
 *
 * @author Marvin
 * @date 2019-10-26 15:00
 * @version 1.0.0
 */
@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class LearningCloudConfigAppliaction {

    public static void main(String[] args) {
        SpringApplication.run(LearningCloudConfigAppliaction.class, args);
    }
}

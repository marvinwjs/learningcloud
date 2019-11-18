package com.learningcloud.gateway.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 配置接口
 * @author Marvin
 * @date 2019-11-01 13:40
 * @version 1.0.0
 */
@RestController
@RequestMapping(value = "config")
public class ConfigController {
    @Value("${info.me}")
    private String info;

    @GetMapping("/info")
    public String getApiVersion() {
        return info;
    }
}

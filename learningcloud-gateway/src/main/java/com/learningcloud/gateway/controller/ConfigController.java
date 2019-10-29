package com.learningcloud.gateway.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

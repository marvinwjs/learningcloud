package com.leaningcloud.provider.controller.admin;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Marvin
 * @date 2019-01-04 15:20
 * @version 1.0.0
 * 用户行为Api
 */
@RestController
@RequestMapping(value = "/userApi")
public class UserController {
    @Value("${info.me}")
    private String info;

    @GetMapping("/info")
    public String getAboutInfo() {
        return info;
    }
}

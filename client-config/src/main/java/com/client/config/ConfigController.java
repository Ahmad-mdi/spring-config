package com.client.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

    @Value("${myapp.name}")
    private String appName;

    @Value("${myapp.version}")
    private String appVersion;

    @GetMapping("/config")
    public String getConfig() {
        return "Application Name: " + appName + ", Version: " + appVersion;
    }
}


package com.frank.config.server;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author franyang
 * @date 2018/9/6
 */
@RestController
@EnableConfigServer
@EnableDiscoveryClient
//@SpringBootApplication
@EnableAutoConfiguration
@Configuration
public class ConfigServerApplication {
    @Value("${spring.application.name}")
    private String serverName;

    @RequestMapping("/")
    public String home() {
        return "Hello It is "+serverName;
    }

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }
}



package com.frank.config.server;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author franyang
 * @date 2018/9/6
 */
@RestController
@EnableConfigServer
@SpringBootApplication
public class ConfigServerApplication {
//    @Value("${spring.application.name}")
//    private String serverName;
//
//
//    @RequestMapping("/health")
//    public String health() {
//        return "Hello It is "+serverName;
//    }


    @RequestMapping("/")
    public String home() {
        return "Hello It is ";
    }

//    @Value("${test}")
//    private String test;
//
//    @RequestMapping("/test")
//    public String home2() {
//        return "Hello It is "+test;
//    }


    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }
}



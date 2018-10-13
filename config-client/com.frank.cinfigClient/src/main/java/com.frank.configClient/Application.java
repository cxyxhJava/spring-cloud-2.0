package com.frank.configClient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author franyang
 * @date 2018/5/29
 */
@EnableDiscoveryClient
@SpringBootApplication
@RestController
public class Application {

    @Value("${test}")
    private String test;

    @RequestMapping("")
    public String home2() {
        return "Hello It is "+test;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

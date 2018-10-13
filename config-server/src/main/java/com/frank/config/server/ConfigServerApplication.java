package com.frank.config.server;

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
    @RequestMapping()
    public String home() {
        return "Hello It is ";
    }
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }
}



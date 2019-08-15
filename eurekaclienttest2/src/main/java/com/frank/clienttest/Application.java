package com.frank.clienttest;

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

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @RequestMapping("/testZuul")
    public String testZuul(){
        return "现在访问的端口是1号";
    }

    @RequestMapping("/testServer")
    public String testServer(){
        return "测试服务注册";
    }
}

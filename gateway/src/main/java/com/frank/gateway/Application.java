package com.frank.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author franyang
 * @date 2018/5/29
 */
@RestController
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public RouteLocator myRouteLocator(RouteLocatorBuilder builder){
        return builder.routes()
                .route(r->r.path("/baidu").uri("https://www.baidu.com/"))
                .build();
    }

    @RequestMapping("/test")
    public String test(){
        return "test";
    }
}

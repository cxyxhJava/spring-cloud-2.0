package com.frank.mongoDb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author franyang
 * @date 2018/10/16
 */
@RestController
@SpringBootApplication
public class MongoDbApplication {
    public static void main(String[] args) {
        SpringApplication.run(MongoDbApplication.class, args);
    }




}

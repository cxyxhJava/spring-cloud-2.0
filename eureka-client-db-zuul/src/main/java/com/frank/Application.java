package com.frank;

import com.frank.center.entity.TestEntity;
import com.frank.center.service.TestService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author franyang
 * @date 2018/5/29
 */
@EnableDiscoveryClient
@SpringBootApplication
@RestController
@MapperScan("com.frank.clienttest.center.dao")
@EntityScan("com.frank.clienttest.center.entity")
public class Application {
    @Autowired
    private TestService testService;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @RequestMapping("/testZuul")
    public String testZuul(){
        return "现在访问的端口是1号";
    }

    @RequestMapping("/testDb")
    public List<TestEntity> testDb(){
        return testService.findAll();
    }
}

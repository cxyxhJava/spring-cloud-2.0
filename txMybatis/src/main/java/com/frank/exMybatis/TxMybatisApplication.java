package com.frank.exMybatis;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author franyang
 * @date 2020/9/5
 */
@MapperScan("com.frank.exMybatis.dao")
@SpringBootApplication
public class TxMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(TxMybatisApplication.class, args);
    }

}

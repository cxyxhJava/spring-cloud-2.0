package com.frank.txMybatis.shardingJdbc;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author franyang
 * @date 2020/9/5
 */com.frank.txMybatis.shardingJdbc.dao
@MapperScan("")
@SpringBootApplication
public class TxMybatisShardingJdbcApplication {

    public static void main(String[] args) {
        SpringApplication.run(TxMybatisShardingJdbcApplication.class, args);
    }

}

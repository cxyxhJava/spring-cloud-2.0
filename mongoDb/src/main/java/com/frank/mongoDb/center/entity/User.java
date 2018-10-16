package com.frank.mongoDb.center.entity;

import lombok.Data;

import java.sql.Timestamp;

/**
 * @author franyang
 * @date 2018/10/16
 */
@Data
public class User {
    private String name;
    private int age;
    private Timestamp timestamp;

}

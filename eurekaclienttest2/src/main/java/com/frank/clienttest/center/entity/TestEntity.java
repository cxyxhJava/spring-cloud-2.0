package com.frank.clienttest.center.entity;


import lombok.Data;
import org.springframework.data.annotation.Id;

/**
 * @author franyang
 * @date 2018/10/12
 */
@Data
public class TestEntity{
    @Id
    private String id;

    private String name;
}

package com.frank.mongoDb.center.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.List;

/**
 * @author franyang
 * @date 2018/10/16
 */
@Data
public class Customer {

    @Id
    public String id;

    public String firstName;
    public String lastName;
    private List<User> userList;


}

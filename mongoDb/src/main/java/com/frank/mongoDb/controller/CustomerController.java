package com.frank.mongoDb.controller;

import com.frank.mongoDb.center.entity.Customer;
import com.frank.mongoDb.center.entity.User;
import com.frank.mongoDb.center.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @author franyang
 * @date 2018/10/16
 */
@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("")
    public List<Customer> findAll(){
        return customerService.findAll();
    }

    @PutMapping("")
    public Customer save(){

        Customer customer = new Customer();
        customer.setFirstName("frank"+LocalDateTime.now());
        customer.setLastName("yang"+LocalDateTime.now());
        List<User> userList = new ArrayList<>();
        User user = new User();
        user.setAge(20);
        user.setName("frank");
        user.setTimestamp(Timestamp.valueOf(LocalDateTime.now()));
        userList.add(user);
        user.setAge(22);
        user.setName("frank2");
        userList.add(user);
        customer.setUserList(userList);

        return customerService.save(customer);
    }



    @PutMapping("/all")
    public List<Customer> saveAll(){
        List<Customer> customerList = new ArrayList<>();
        Customer customer = new Customer();
        customer.setFirstName("frank");
        customer.setLastName("yang");
        List<User> userList = new ArrayList<>();
        User user = new User();
        user.setAge(20);
        user.setName("frank");
        user.setTimestamp(Timestamp.valueOf(LocalDateTime.now()));
        userList.add(user);
        user.setAge(22);
        user.setName("frank2");
        userList.add(user);
        customer.setUserList(userList);
        customerList.add(customer);

        customer.setFirstName("frank2");
        customer.setLastName("yang2");
        userList.add(user);
        customer.setUserList(userList);
        customerList.add(customer);

        return customerService.saveAll(customerList);
    }

}

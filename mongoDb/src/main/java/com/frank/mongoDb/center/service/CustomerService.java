package com.frank.mongoDb.center.service;

import com.frank.mongoDb.center.dao.CustomerRepository;
import com.frank.mongoDb.center.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author franyang
 * @date 2018/10/16
 */
@Service
@Transactional
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;


    public List<Customer> findAll(){
        return customerRepository.findAll();
    }

    public Customer save(Customer customer){
        return customerRepository.save(customer);
    }

    public List<Customer> saveAll(List<Customer> customerList){
        return customerRepository.saveAll(customerList);
    }

}

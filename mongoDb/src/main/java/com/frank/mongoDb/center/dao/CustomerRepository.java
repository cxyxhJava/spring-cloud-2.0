package com.frank.mongoDb.center.dao;

import com.frank.mongoDb.center.entity.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * @author franyang
 * @date 2018/10/16
 */
public interface CustomerRepository extends MongoRepository<Customer, String> {

    Customer findByFirstName(String firstName);

    List<Customer> findByLastName(String lastName);

}

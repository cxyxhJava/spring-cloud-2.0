package com.frank.clienttest.center.dao;

import com.frank.clienttest.center.entity.TestEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * @author franyang
 * @date 2018/10/12
 */
public interface TestRepository extends MongoRepository<TestEntity,String> {
    List<TestEntity> findAllByName(String name);
}

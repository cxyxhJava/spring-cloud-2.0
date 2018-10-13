package com.frank.clienttest.center.dao;

import com.frank.clienttest.center.entity.TestEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author franyang
 * @date 2018/10/12
 */
@Repository
public interface TestDao {
    public List<TestEntity> findAll();
}

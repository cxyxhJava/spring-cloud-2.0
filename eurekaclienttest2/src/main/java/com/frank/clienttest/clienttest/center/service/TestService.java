package com.frank.clienttest.clienttest.center.service;

import com.frank.clienttest.center.dao.TestDao;
import com.frank.clienttest.center.entity.TestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author franyang
 * @date 2018/10/12
 */
@Service
@Transactional
public class TestService {
    @Autowired
    TestDao testDao;

    public List<TestEntity> findAll(){
        return testDao.findAll();
    }
}

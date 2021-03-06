package com.frank.center.service;

import com.frank.center.dao.TestDao;
import com.frank.center.entity.TestEntity;
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

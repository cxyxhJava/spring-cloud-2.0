package com.frank.center.dao;

import com.frank.center.entity.TestEntity;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author franyang
 * @date 2018/10/12
 */
@Repository
public interface TestDao {

    @Select("select * from test")
    public List<TestEntity> findAll();
}

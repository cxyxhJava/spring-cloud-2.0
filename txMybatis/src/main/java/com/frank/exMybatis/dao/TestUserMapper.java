package com.frank.exMybatis.dao;

import com.frank.exMybatis.entity.TestUser;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.additional.insert.InsertListMapper;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author franyang
 * @date 2020/9/5
 */
@Repository
public interface TestUserMapper extends Mapper<TestUser>, InsertListMapper<TestUser> {
}

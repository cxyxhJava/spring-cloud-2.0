package com.frank.exMybatis.service;

import com.frank.exMybatis.dao.TestUserMapper;
import com.frank.exMybatis.entity.TestUser;
import com.frank.exMybatis.vo.req.PageReq;
import com.frank.exMybatis.vo.resp.PageResp;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author franyang
 * @date 2020/9/5
 */
@Service
@Transactional
public class TestUserService {

    @Autowired private TestUserMapper mapper;

    public List<TestUser> findAll(){
       return mapper.selectAll();
    }
    public int insert(TestUser entity){
        return mapper.insert(entity);
    }

    public int insert(List<TestUser> entityList){
        return mapper.insertList(entityList);
    }


    public PageResp<TestUser> pageAll(PageReq pageReq){
        PageHelper.startPage(pageReq.getPageNo(),pageReq.getPageSize());
        List<TestUser> testUserList = mapper.selectAll();
        PageInfo<TestUser> pageInfo = new PageInfo<>(testUserList);

        PageResp<TestUser> resp = new PageResp<>();
        resp.setData(pageInfo.getList());
        resp.setPageNo(pageInfo.getPageNum());
        resp.setPageSize(pageInfo.getPageSize());
        resp.setTotalSize(pageInfo.getTotal());
        return resp;
    }



}

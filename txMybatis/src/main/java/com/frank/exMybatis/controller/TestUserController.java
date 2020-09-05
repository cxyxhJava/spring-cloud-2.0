package com.frank.exMybatis.controller;

import com.frank.exMybatis.entity.TestUser;
import com.frank.exMybatis.service.TestUserService;
import com.frank.exMybatis.vo.req.PageReq;
import com.frank.exMybatis.vo.resp.PageResp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author franyang
 * @date 2020/9/5
 */
@RestController
@RequestMapping("/test/user")
public class TestUserController {
    @Autowired private TestUserService testUserService;

    @GetMapping("/list")
    public List<TestUser> finAll(){
        return testUserService.findAll();

    }
    @PostMapping ("/page")
    public PageResp<TestUser> finAll(@RequestBody PageReq pageReq){
        return testUserService.pageAll(pageReq);
    }

    @PostMapping("/save")
    public int insert(@RequestBody TestUser testUser){
        return testUserService.insert(testUser);
    }

    @PostMapping("/save/list")
    public int insert(@RequestBody List<TestUser> testUserList){
        return testUserService.insert(testUserList);
    }
}

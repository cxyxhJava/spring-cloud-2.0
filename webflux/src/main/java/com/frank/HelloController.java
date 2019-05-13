package com.frank;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Author     ：杨晓波
 * @ Date       ：Created in 10:20 2019-02-18
 * @ Description：注解模式
 * @ Modified By：
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public String hello(){
        return "Hello world 注解模式";
    }
}

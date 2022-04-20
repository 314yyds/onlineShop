package com.shop.controller;

import com.shop.model.bo.TestBo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yanghd
 * @version 1.0
 * @date 2022/3/24 0:11
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/come")
    public String helloWord(String str) {
        System.out.println("进来了2");
        TestBo testBo = new TestBo();
        return "传进来锤子：" + str;
    }
}

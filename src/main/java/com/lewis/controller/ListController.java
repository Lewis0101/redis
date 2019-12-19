package com.lewis.controller;

import com.lewis.model.User;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : 00222 [liu.yang@unisinsight.com]
 * @description:
 * @date : 2019/10/29 15:24
 * @since: 1.0
 */
@RestController
@RequestMapping(value = "/list",method = RequestMethod.POST)
public class ListController {

    @PostMapping(value = "/index")
    @Cacheable(cacheNames = "product",key = "123")
    public int list(){

        List<User> list = new ArrayList();
        return list.size();
    }

}

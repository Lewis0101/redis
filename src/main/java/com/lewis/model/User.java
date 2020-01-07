package com.lewis.model;

import com.alibaba.fastjson.JSONObject;

import java.io.Serializable;


/**
 * @author : 00222 [liu.yang@unisinsight.com]
 * @description:
 * @date : 2019/10/22 11:17
 * @since: 1.0
 */
public class User implements Serializable {
    private static final long serialVersionUID = 4890214899118953692L;
    /**
     * 编号
     */
    private int id;
    /**
     * 姓名
     */
    private String name;
    /**
     * 年龄
     */
    private int age;

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return JSONObject.toJSONString(this);
    }

}

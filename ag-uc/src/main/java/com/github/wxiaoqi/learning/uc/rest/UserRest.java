package com.github.wxiaoqi.learning.uc.rest;

import com.github.wxiaoqi.learning.uc.pojo.BaseUser;
import com.github.wxiaoqi.learning.uc.service.BaseUserDao;
import com.github.wxiaoqi.learning.uc.service.impl.BaseUserDaoImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("user")
public class UserRest {
    @Resource
    private BaseUserDao baseUserDao;

    @Value("${language.en:你好世界}")
    private String hello;
    @RequestMapping("/hello")
    public String getUserInfo(@PathVariable String id){
        return hello;
    }
    @RequestMapping("/{id}")
    public BaseUser get(@PathVariable Integer id){
        return baseUserDao.selectByPrimaryKey(1);
    }

    @RequestMapping("/list")
    public List<BaseUser> getlist(){
        return baseUserDao.findaddlist();
    }
}

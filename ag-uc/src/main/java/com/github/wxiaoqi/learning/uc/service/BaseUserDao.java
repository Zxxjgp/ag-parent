package com.github.wxiaoqi.learning.uc.service;

import com.github.wxiaoqi.learning.uc.mapper.BaseUserMapper;
import com.github.wxiaoqi.learning.uc.pojo.BaseUser;

import java.util.List;

public interface BaseUserDao extends BaseUserMapper {
    List<BaseUser> findaddlist();
}

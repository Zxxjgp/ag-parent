package com.github.wxiaoqi.learning.uc.mapper;

import com.github.wxiaoqi.learning.uc.pojo.BaseUser;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface BaseUserMapper extends Mapper<BaseUser> {
    List<BaseUser> selectListAll();
}
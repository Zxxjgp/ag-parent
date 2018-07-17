package com.github.wxiaoqi.learning.uc.service.impl;

import com.github.wxiaoqi.learning.uc.mapper.BaseUserMapper;
import com.github.wxiaoqi.learning.uc.service.BaseUserDao;
import com.github.wxiaoqi.learning.uc.pojo.BaseUser;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class BaseUserDaoImpl implements BaseUserDao{

    @Autowired
    private BaseUserMapper baseUserMapper;

    @Override
    public List <BaseUser> findaddlist() {
        return baseUserMapper.findaddlist();
    }

    @Override
    public int deleteByPrimaryKey(Object o) {
        return 0;
    }

    @Override
    public int delete(BaseUser baseUser) {
        return 0;
    }

    @Override
    public int insert(BaseUser baseUser) {
        return 0;
    }

    @Override
    public int insertSelective(BaseUser baseUser) {
        return 0;
    }

    @Override
    public boolean existsWithPrimaryKey(Object o) {
        return false;
    }

    @Override
    public List <BaseUser> selectAll() {
        return null;
    }

    @Override
    public BaseUser selectByPrimaryKey(Object o) {
        return baseUserMapper.selectByPrimaryKey(0);
    }

    @Override
    public int selectCount(BaseUser baseUser) {
        return 0;
    }

    @Override
    public List <BaseUser> select(BaseUser baseUser) {
        return null;
    }

    @Override
    public BaseUser selectOne(BaseUser baseUser) {
        return null;
    }

    @Override
    public int updateByPrimaryKey(BaseUser baseUser) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(BaseUser baseUser) {
        return 0;
    }

    @Override
    public int deleteByExample(Object o) {
        return 0;
    }

    @Override
    public List <BaseUser> selectByExample(Object o) {
        return null;
    }

    @Override
    public int selectCountByExample(Object o) {
        return 0;
    }

    @Override
    public int updateByExample(BaseUser baseUser, Object o) {
        return 0;
    }

    @Override
    public int updateByExampleSelective(BaseUser baseUser, Object o) {
        return 0;
    }

    @Override
    public List <BaseUser> selectByExampleAndRowBounds(Object o, RowBounds rowBounds) {
        return null;
    }

    @Override
    public List <BaseUser> selectByRowBounds(BaseUser baseUser, RowBounds rowBounds) {
        return null;
    }
}

package com.github.wxiaoqi.learning.uc.service;

import com.github.wxiaoqi.common.biz.BaseBiz;
import com.github.wxiaoqi.common.exception.BaseException;
import com.github.wxiaoqi.learning.uc.mapper.BaseUserMapper;
import com.github.wxiaoqi.learning.uc.pojo.BaseUser;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ProjectName: ag-parent
 * @Package: com.github.wxiaoqi.learning.uc.service
 * @ClassName: BaseService
 * @Description: java类作用描述
 * @Author: 焦关平
 * @CreateDate: 2018/7/18 15:56
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/7/18 15:56
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Service
@Transactional
public class BaseService extends BaseBiz<BaseUserMapper,BaseUser> {
    @Override
    public BaseUser selectById(Object id) {
        throw  new BaseException("Test Glober Exception");
    }
}

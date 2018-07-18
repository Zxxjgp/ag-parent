package com.github.wxiaoqi.learning.uc.rest;

import com.github.wxiaoqi.common.rest.BaseController;
import com.github.wxiaoqi.learning.uc.pojo.BaseUser;
import com.github.wxiaoqi.learning.uc.service.BaseService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserRest extends BaseController<BaseService,BaseUser> {

}

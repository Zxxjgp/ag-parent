package com.github.wxiaoqi.common.context;

import com.github.wxiaoqi.common.constant.RestCodeConstants;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * @ProjectName: ag-parent
 * @Package: com.github.wxiaoqi.common.context
 * @ClassName: BaseContextHandler
 * @Description: 获取上下文的类
 * @Author: 焦关平
 * @CreateDate: 2018/7/18 20:14
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/7/18 20:14
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class BaseContextHandler {
    public static ThreadLocal<Map<String,Object>> threadLocal = new ThreadLocal<Map<String,Object>>();
    public  static void setContext(String key , Object value){
        Map<String, Object> map = threadLocal.get();
        if ( map == null){
            map = new HashMap<String,Object>();
        }
        map.put(key,value);
        threadLocal.set(map);
    }

    public static Object get(String key){
        Map<String, Object> map = threadLocal.get();
        if ( map == null){
            map = new HashMap<String,Object>();
        }
        return  map.get(key);
    }

    public static void  init(){
        Map<String, Object> map = threadLocal.get();
        if ( map == null){
            map = new HashMap<String,Object>();
        }
    }

    public  static  void remove(){
        threadLocal.remove();
    }

    public static  String getUserId(){
        Object value = get(RestCodeConstants.CONTEXT_KEY_USER_ID);
        return returnObjectValue(value);
    }
    public static  String getUserName(){
        Object value = get(RestCodeConstants.CONTEXT_KEY_USER_NAME);
        return returnObjectValue(value);
    }
    public static void setUserId(String userId){
        setContext(RestCodeConstants.CONTEXT_KEY_USER_ID,userId);
    }
    public static void setUserName(String userName){
        setContext(RestCodeConstants.CONTEXT_KEY_USER_NAME,userName);
    }

    public static  String returnObjectValue(Object value){
        return value == null ? null : value.toString();
    }

    @RunWith(MockitoJUnitRunner.class)
    public static  class UnitTest{
         private  Logger logger = LoggerFactory.getLogger(UnitTest.class);
        @Test
        public void setUserInfo(){
            BaseContextHandler.setUserId("test");
            assertEquals(BaseContextHandler.getUserId(),"test");
        }
    }
}

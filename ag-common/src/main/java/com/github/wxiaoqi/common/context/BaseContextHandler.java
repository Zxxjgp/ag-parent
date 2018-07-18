package com.github.wxiaoqi.common.context;

import java.util.HashMap;
import java.util.Map;

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
}

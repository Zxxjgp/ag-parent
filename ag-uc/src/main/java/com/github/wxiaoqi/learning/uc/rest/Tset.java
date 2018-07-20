package com.github.wxiaoqi.learning.uc.rest;

import com.github.wxiaoqi.learning.uc.pojo.Person;
import org.json.JSONObject;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 * @ProjectName: ag-parent
 * @Package: com.github.wxiaoqi.learning.uc.rest
 * @ClassName: Tset
 * @Description: java类作用描述
 * @Author: 焦关平
 * @CreateDate: 2018/7/19 18:48
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/7/19 18:48
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */


public class Tset {



    public static void main(String[] args) {
        LocalDateTime nowTime= LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.printf(nowTime.format(df));
    }

}

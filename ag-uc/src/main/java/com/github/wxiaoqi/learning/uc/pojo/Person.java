package com.github.wxiaoqi.learning.uc.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @ProjectName: ag-parent
 * @Package: com.github.wxiaoqi.learning.uc.pojo
 * @ClassName: Person
 * @Description: java类作用描述
 * @Author: 焦关平
 * @CreateDate: 2018/7/19 18:55
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/7/19 18:55
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class Person {
    private String id;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date birthday;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}

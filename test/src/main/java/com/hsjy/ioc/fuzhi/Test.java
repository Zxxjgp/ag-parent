package com.hsjy.ioc.fuzhi;

import org.springframework.beans.BeanUtils;

import java.util.Date;

public class Test {

    @Test
    public void test(){
        Person p=new Person();
        p.setAvgScore(3.0);
        p.setCourseName("courseName");
        p.setCreateTime(new Date());
        p.setNum(2);

        Student s=new Student();
        s.setStudentName("studentName");
        BeanUtils.copyProperties(p, s);

        System.out.println(p);
        System.out.println("-------------------");
        System.out.println(s);
    }


}
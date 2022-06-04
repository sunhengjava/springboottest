package com.cn.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


//第一种此注解会自动读取配置文件中以student开头的变量名
//


//spring加载的时候就会默认把它加载进去
@Component
//@PropertySource(value = {"classpath:/config/config.properties"})
public class Student {

   @Value("${student.id}")
    private int id;
    @Value("${student.name}")
    private String name;
   @Value("${student.addr}")
    private String addr;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}

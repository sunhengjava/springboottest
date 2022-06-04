package com.cn.mapper;

import com.cn.entity.Person;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PersonMappe {
    public List<Person> findPersonList(@Param("data_time") String data_time);
}

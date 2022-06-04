package com.cn.service;

import com.cn.entity.Person;
import com.cn.entity.Student;
import com.cn.mapper.PersonMappe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private Student student;


    @Autowired(required = false)
    private PersonMappe personMapper;

    public Student getStudentInfo() {
        student.setId(1);
        //student.setName("张三");
        return student;
    }

    public List<Person> finds(  String data_time) {
        List<Person> list1 = personMapper.findPersonList(data_time);
        return list1;
    }

}

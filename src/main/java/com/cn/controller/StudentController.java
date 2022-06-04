package com.cn.controller;

import com.cn.entity.Person;
import com.cn.entity.Student;
import com.cn.service.StudentService;
import org.apache.ibatis.annotations.Param;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;


    //记录器
    Logger logger = LoggerFactory.getLogger(getClass());
    @Test
    public void contextLoads() {
        //System.out.println();

        //日志的级别；
        //由低到高   trace<debug<info<warn<error
        //可以调整输出的日志级别；日志就只会在这个级别以以后的高级别生效

        logger.debug("这是debug日志...");
        //SpringBoot默认给我们使用的是info级别的，没有指定级别的就用SpringBoot默认规定的级别；root级别
        logger.info("这是info日志...");
        logger.warn("这是warn日志...");
        logger.error("这是error日志...");
        logger.trace("这是trace日志...");


    }
    @GetMapping(value = "show")
    @ResponseBody
    public Student show() {
        return studentService.getStudentInfo();
    }

    @GetMapping(value = "show2")
    @ResponseBody
    public Student show2(HttpServletRequest request) {
        String name=request.getParameter("name");
        String id=request.getParameter("id");
        System.out.println(name+id);
        return studentService.getStudentInfo();
    }
    @GetMapping(value = "show/test")
    @ResponseBody
    public String showtest() {
        return "showTest";
    }
    @GetMapping(value = "test")
    @ResponseBody
    public String test() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String ly_time = sdf.format(new java.util.Date());

        System.out.println("现在时间是:"+ly_time);
        return "";
    }

    //请求案例localhost:8084/shows/222,33   他会把你的值直接赋值到对应的rest参数上
    @GetMapping(value = "/shows/{list}")
    @ResponseBody
    public Student shows(@PathVariable List list) {
        /*localhost:9221/shows/1,2,4 */
        System.out.println(list);
        for(Object li:list){
            System.out.println(li);
        }
        return studentService.getStudentInfo();
    }

    @PostMapping(value = "/showsString")
    @ResponseBody
    public String showsString(@RequestBody List<Map> one,@RequestParam Long areaId) {
        /*localhost:9221/shows/1,2,4 */
        System.out.println(one);
        return "ok";
    }

    @GetMapping(value = "/finds")
    public List<Person> finds(  String data_time) {
        return studentService.finds(data_time);
    }

    @RequestMapping("getTest")
    public String  getTest(  @RequestParam  String data_time,String name,int id) {

        System.out.println(data_time+"--"+name+"--"+id);
        return "ok";

    }


    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        list.add("sss");
        System.out.println(list);
    }



}

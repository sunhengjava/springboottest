package com.cn;
//
//import com.alibaba.nacos.api.config.annotation.NacosValue;
//import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
//@NacosPropertySource(dataId = "springboot2-nacos-config", autoRefreshed = true)
//@RestController

public class SpringboottestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringboottestApplication.class, args);
    }
/*    @NacosValue(value = "${nacos.test.propertie:123}", autoRefreshed = true)
   private String testProperties;
    @GetMapping("/test")
    public String test(){
        return testProperties;
    }*/

}

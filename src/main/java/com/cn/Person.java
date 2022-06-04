package com.cn;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.List;

/**
 * 报文对应class
 *
 * @author <a href="***@163.com">***</a>
 * @version 1.0.0
 * @since 1.0.0
 * <p>
 * Created at 2018/9/30
 */

@JacksonXmlRootElement(localName = "msgbody")
public class Person {
    @JacksonXmlProperty(localName = "serverId")
    private String serverId;
    @JacksonXmlProperty(localName = "name")
    private String name;
    @JacksonXmlProperty(localName = "age")
    private String age;
    @JacksonXmlProperty(localName = "address")
    private String address;
    @JacksonXmlElementWrapper(localName = "StringList")
    private List<Clazz> stringList;

    public Person() {
    }

    public Person(String serverId, String name, String age, String address, List<Clazz> stringList) {
        this.serverId = serverId;
        this.name = name;
        this.age = age;
        this.address = address;
        this.stringList = stringList;
    }

    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Clazz> getStringList() {
        return stringList;
    }

    public void setStringList(List<Clazz> stringList) {
        this.stringList = stringList;
    }

    @Override
    public String toString() {
        return "Person{" +
                "serverId='" + serverId + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", address='" + address + '\'' +
                ", stringList=" + stringList +
                '}';
    }
}
package com.cn;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * 报文中列表对应class
 *
 * @author <a href="***@163.com">***</a>
 * @version 1.0.0
 * @since 1.0.0
 * <p>
 * Created at 2018/10/9
 */
@JacksonXmlRootElement(localName = "MX")
public class Clazz {
    @JacksonXmlProperty(localName = "paramA")
    private String a;
    @JacksonXmlProperty(localName = "paramB")
    private String b;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "a='" + a + '\'' +
                ", b='" + b + '\'' +
                '}';
    }
}
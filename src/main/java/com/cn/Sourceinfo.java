package com.cn;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "sourceinfo")
public class Sourceinfo {
    @JacksonXmlProperty(localName = "filestart")
    private String filestart;
    @JacksonXmlProperty(localName = "area_id")
    private String area_id;
    @JacksonXmlProperty(localName = "tmidstart")
    private String tmidstart;
    @JacksonXmlProperty(localName = "encode")
    private String encode;

    public String getFilestart() {
        return filestart;
    }

    public void setFilestart(String filestart) {
        this.filestart = filestart;
    }

    public String getArea_id() {
        return area_id;
    }

    public void setArea_id(String area_id) {
        this.area_id = area_id;
    }

    public String getTmidstart() {
        return tmidstart;
    }

    public void setTmidstart(String tmidstart) {
        this.tmidstart = tmidstart;
    }

    public String getEncode() {
        return encode;
    }

    public void setEncode(String encode) {
        this.encode = encode;
    }

    @Override
    public String toString() {
        return "Sourceinfo{" +
                "filestart='" + filestart + '\'' +
                ", area_id='" + area_id + '\'' +
                ", tmidstart='" + tmidstart + '\'' +
                ", encode='" + encode + '\'' +
                '}';
    }
}

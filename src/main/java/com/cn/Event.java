package com.cn;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "event")
public class Event {
    @JacksonXmlProperty(localName = "type")
    private String type;
    @JacksonXmlProperty(localName = "ip")
    private String ip;
    @JacksonXmlProperty(localName = "port")
    private String port;
    @JacksonXmlProperty(localName = "path")
    private String path;
    @JacksonXmlProperty(localName = "user")
    private String user;
    @JacksonXmlProperty(localName = "password")
    private String password;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Event{" +
                "type='" + type + '\'' +
                ", ip='" + ip + '\'' +
                ", port='" + port + '\'' +
                ", path='" + path + '\'' +
                ", user='" + user + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

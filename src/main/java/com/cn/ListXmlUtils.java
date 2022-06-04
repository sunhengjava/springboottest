package com.cn;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.List;

@JacksonXmlRootElement(localName = "msgbody")
public class ListXmlUtils {

    @JacksonXmlElementWrapper(localName = "target")
    private List<Event> target;
    @JacksonXmlElementWrapper(localName = "hisdata")
    private List<Event> hisdata;
    @JacksonXmlElementWrapper(localName = "sourcelist")
    private List<Sourceinfo> sourcelist;

    public List<Event> getTarget() {
        return target;
    }

    public void setTarget(List<Event> target) {
        this.target = target;
    }

    public List<Event> getHisdata() {
        return hisdata;
    }

    public void setHisdata(List<Event> hisdata) {
        this.hisdata = hisdata;
    }

    public List<Sourceinfo> getSourcelist() {
        return sourcelist;
    }

    public void setSourcelist(List<Sourceinfo> sourcelist) {
        this.sourcelist = sourcelist;
    }

    public ListXmlUtils(List<Event> target, List<Event> hisdata, List<Sourceinfo> sourcelist) {
        this.target = target;
        this.hisdata = hisdata;
        this.sourcelist = sourcelist;
    }

    public ListXmlUtils() {
    }


    @Override
    public String toString() {
        return "ListXmlUtils{" +
                "target=" + target +
                ", hisdata=" + hisdata +
                ", sourcelist=" + sourcelist +
                '}';
    }
}

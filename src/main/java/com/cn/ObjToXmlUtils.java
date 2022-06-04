package com.cn;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.ByteArrayOutputStream;
import java.io.File;

public class ObjToXmlUtils {
    public String xmlToString(Document document) throws Throwable {
        TransformerFactory ft = TransformerFactory.newInstance();
        Transformer ff = ft.newTransformer();
        ff.setOutputProperty("encoding", "UTF-8");
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ff.transform(new DOMSource(document), new StreamResult(bos));
        return bos.toString();
    }

    public static void main(String[] args) throws Throwable {

        // 读取xml文件，生成document对象
        DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        // 文件的位置在工作空间的根目录（位置随意，只要写对就ok）
        Document document = builder.parse(new File("testOne.xml"));
        ObjToXmlUtils s = new ObjToXmlUtils();
        // XML————》String
        String str = s.xmlToString(document);
        // System.out.println("str:" + str);
        //   String xml = "<?xml version=\"1.0\" encoding=\"utf-8\"?><msgbody><StringList><mx><paramA>Aone</paramA><paramB>Bone</paramB></mx><mx><paramA>Atow</paramA><paramB>Atow</paramB></mx></StringList><serverId>serv10000000156</serverId><name>张三</name><age>女</age><address>武汉市</address></msgbody>\n";
        ObjectMapper mapper = new XmlMapper();
        Object po = null;
        po = mapper.readValue(str, ListXmlUtils.class);

        System.out.println(po.toString());

    }

}
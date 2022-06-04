package com.cn;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class DOMDemo {
    public static void main(String[] args) {
        //1. build DocumentBuilderFactory
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        //2.
        DocumentBuilder builder = null;
        try {
            builder = factory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
        //3.
        Document doc = null;
        try {
            doc = builder.parse("D:\\jar" + File.separator + "testOne.xml");
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //4.
        NodeList nl = doc.getElementsByTagName("name");
        //5.
        System.out.println("姓名: " + nl.item(0).getFirstChild().getNodeValue());

    }

}

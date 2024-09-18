package com.example.demo.controller;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * 报文中列表对应class
 *
 * @author <a href="***@163.com">***</a>
 * @version 1.0.0
 * @since 1.0.0
 * <p>
 * Created at 2018/10/9
 */
//@JacksonXmlRootElement(localName = "item")
@lombok.Data
public class Fields {

//    @JacksonXmlElementWrapper(localName = "item")
    @JacksonXmlProperty(localName = "FIELDNAME")
    private String filedName;

    @JacksonXmlProperty(localName = "OFFSET")
    private String offSet;

    @JacksonXmlProperty(localName = "LENGTH")
    private String length;

    @JacksonXmlProperty(localName = "TYPE")
    private String type;

    @JacksonXmlProperty(localName = "FIELDTEXT")
    private String filedText;

//    @JacksonXmlElementWrapper(localName = "item")
//    @JacksonXmlProperty(localName = "WA")
//    private List<String> wa;

}
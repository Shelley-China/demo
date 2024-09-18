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
public class Data {

    @JacksonXmlProperty(localName = "WA")
    private String wa;

}
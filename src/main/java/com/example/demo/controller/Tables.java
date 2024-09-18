package com.example.demo.controller;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

import java.util.List;

/**
 * 报文中列表对应class
 *
 * @author <a href="***@163.com">***</a>
 * @version 1.0.0
 * @since 1.0.0
 * <p>
 * Created at 2018/10/9
 */
@Data
public class Tables {

//    @JacksonXmlProperty(localName = "DATA")
//    private com.lenovo.lmp.scs.model.dto.Data data;

    @JacksonXmlElementWrapper(localName = "DATA")
    private List<com.example.demo.controller.Data> data;

//    @JacksonXmlProperty(localName = "FIELDS")
    @JacksonXmlElementWrapper(localName = "FIELDS")
    @JacksonXmlProperty(localName = "item")
    private List<Fields> fields;
//
    @JacksonXmlElementWrapper(localName = "OPTIONS")
    private List<Options> options;

//    @JacksonXmlProperty(localName = "paramB")
//    private String b;

}
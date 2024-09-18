package com.example.demo.controller;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

@JacksonXmlRootElement(localName = "RFC_READ_TABLE")
@Data
public class EccEkbeResponse {

    @JacksonXmlProperty(localName = "INPUT")
    private Input input;

    @JacksonXmlProperty(localName = "OUTPUT")
    private Output output;

    @JacksonXmlProperty(localName = "TABLES")
    private Tables tables;

//
//    @JacksonXmlElementWrapper(localName = "StringList")
//    private List<Tables> mx;


}
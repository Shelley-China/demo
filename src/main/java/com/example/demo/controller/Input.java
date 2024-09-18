package com.example.demo.controller;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

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
public class Input {
    @JacksonXmlProperty(localName = "DELIMITER")
    private String delimiter;
    @JacksonXmlProperty(localName = "GET_SORTED")
    private String getSorted;
    @JacksonXmlProperty(localName = "NO_DATA")
    private String noData;
    @JacksonXmlProperty(localName = "QUERY_TABLE")
    private String queryTable;
    @JacksonXmlProperty(localName = "ROWCOUNT")
    private String rowCount;
    @JacksonXmlProperty(localName = "ROWSKIPS")
    private String rowSkips;
    @JacksonXmlProperty(localName = "USE_ET_DATA_4_RETURN")
    private String useEtData4Return;

}
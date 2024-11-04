package com.example.demo.dao;

import lombok.Data;

import java.util.List;

/**
 * @Author: lizhong7
 * @Since: 2022/7/14 9:36
 * @Version 1.0
 */

@Data
public class WmsSendScsInboundMsgDto {

    private Boolean callHic;
    private List<WmsInboundDoItem> wmsInboundDoItemList;

}

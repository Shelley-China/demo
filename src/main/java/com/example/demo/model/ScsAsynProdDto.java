package com.example.demo.model;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class ScsAsynProdDto {

    @JSONField(name = "customerNo")
    private String customerNo;
    @JSONField(name = "shipFromWmsCode")
    private String shipFromWmsCode;
    @JSONField(name = "shipToWmsCode")
    private String shipToWmsCode;
    @JSONField(name = "details")
    private List<OrderDetail> orderDetails;

}

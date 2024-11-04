package com.example.demo.dao;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class OmsInterfaceResponseDto {

    @JSONField(name = "Flag")
    private Flag Flag;

    @JSONField(name = "Order")
    private Order Order;

}

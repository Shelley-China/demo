package com.example.demo.dao;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class Order {
    @JSONField(name = "Header")
    private Header header;

}

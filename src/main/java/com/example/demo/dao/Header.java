package com.example.demo.dao;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Builder;
import lombok.Data;

@Data
public class Header {

    @JSONField(name = "headextention")
    private Headextention headextention = new Headextention();

}

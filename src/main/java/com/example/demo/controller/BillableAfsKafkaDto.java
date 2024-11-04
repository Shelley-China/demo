package com.example.demo.controller;

import lombok.Data;

@Data
public class BillableAfsKafkaDto {

    /**
     * location 存储的是country值
     */
    private String location;
    private String topmost;
    private String apply;
    private String onOff;
}

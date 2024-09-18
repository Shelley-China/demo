package com.example.demo.controller;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class ESupportKafkaDto {
    private String salesEntity;
    private String plant;
    private String location;
    private String topmostPartNo;
    private String partNo;
    private String netAfsQty;
    @JsonIgnore
    private BigDecimal bufferStockQty;
    @JsonIgnore
    private String afsCategory;
    @JsonIgnore
    private String calculateType;
    @JsonIgnore
    private Integer quota;
    private String dateTime;
    private String currency;


}

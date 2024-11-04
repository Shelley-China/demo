package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SopNettedForecastFgDto {

    private String brand;
    private Long effstartdate;
    private String family;
    private String flag;
    private String geo;
    private String itemclass;
    private String origSegment;
    private String product;
    private Integer qty;
    private String repCto;
    private String siteid;
    private String subgeo;
    private String supplierid;
    private Long versiondate;
    private String versionweek;
    private Long versionyear;


}

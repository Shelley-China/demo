package com.example.demo.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SopGrossForecastTbgDto {

    private String versiondate;
    private String bizUnit;
    private String channel;
    private String characteristics;
    private String customerSegment;
    private String effstartdate;
    private BigDecimal forecastqty;
    private String geo;
    private String itemdesc;
    private String itemtype;
    private String measure;
    private BigDecimal modifyForecast;
    private String planningItemId;
    private String prodfamily;
    private String prodfamilydescr;
    private String sbbId;
    private Integer scenarioId;
    private String segment;
    private String siteId;
    private String subgeo;
    private String value;
    //private String bu;
    //private String brand;
    //private String projectNo;



}

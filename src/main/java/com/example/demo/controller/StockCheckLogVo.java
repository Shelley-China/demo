package com.example.demo.controller;


import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
public class StockCheckLogVo{
    /**
     * 国家
     */
    private String country;
    private String crmVendorId;
    /**
     * 来源系统id
     */
    private String systemId;
    /**
     * 销售实体
     */
    private String salesEntity;

    private String serviceDeliveryType;
    /**
     * 物料号
     */
    private String partNo;
    /**
     * 商品编码
     */
    private String commodityCode;
    /**
     * 顶层物料号
     */
    private String tmPartNo;
    /**
     * 工厂
     */
    private String plant;
    /**
     * 位置
     */
    private String location;
    /**
     * 位置
     */
    private String planningLocation;
    /**
     * 可用库存数量
     */
    private BigDecimal netAfsQty;
    /**
     * 错误信息
     */
    private String errorMsg;
    /**
     * 位置类型
     */
    private String locationType;
    /**
     *
     */
    private BigDecimal weeklyRunRate;

    private BigDecimal bufferStockQty;
    /**
     *
     */
    private BigDecimal minimumDaily;
    /**
     * 序列号
     */
    private String serialNo;
    /**
     * 优先级
     */
    private Integer priority;
    /**
     * 已校验标志位
     */
    private Boolean hasCheckedFlag;

    private Boolean needDistribute;

    private String shipFromCountry;
    private String calculateType;
    private String afsCategory;
    private String afsApply;
    private String afsList;


}

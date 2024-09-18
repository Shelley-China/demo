package com.example.demo.controller;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;
import org.apache.commons.lang3.ObjectUtils;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Data
@Builder
public class StockCheckVo {
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
    @JsonIgnore
    private String locationType;
    /**
     *
     */
    @JsonIgnore
    private BigDecimal weeklyRunRate;

    @JsonIgnore
    private BigDecimal bufferStockQty;
    /**
     *
     */
    @JsonIgnore
    private BigDecimal minimumDaily;
    /**
     * 序列号
     */
    @JsonIgnore
    private String serialNo;
    /**
     * 优先级
     */
    @JsonIgnore
    private Integer priority;
    /**
     * 已校验标志位
     */
    @JsonIgnore
    private Boolean hasCheckedFlag;

    @JsonIgnore
    private Boolean needDistribute = true;

    private String shipFromCountry;
    private String calculateType;
    private String afsCategory;
    private String afsApply;
    private String afsList;

    List<PromotionDto> items;

    @JsonIgnore
    public Integer getPriorityWithDefault() {
        return ObjectUtils.defaultIfNull(priority, 0);
    }

    public BigDecimal getBufferStockQty() {
        return bufferStockQty;
    }

}

package com.example.demo.controller;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateFormatUtils;

import java.math.BigDecimal;

/**
 * <p>
 *
 * </p>
 *
 * @author lizhong7
 * @since 2022-12-22
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class OmsPromotionRecord extends Model<OmsPromotionRecord>  {

    private static final long serialVersionUID = 1L;

    @TableId("id")
    private String id;
    @TableField("promotion_id")
    private String promotionId;
    @TableField("promotion_type")
    private String promotionType;
    @TableField("status")
    private String status;
    @TableField("effective_from")
    private Long effectiveFrom;
    @TableField("effective_to")
    private Long effectiveTo;
    @TableField("part_no")
    private String partNo;
    @TableField("promotion_qty")
    private BigDecimal promotionQty;
    @TableField("promotion_price")
    private BigDecimal promotionPrice;
    @TableField("currency")
    private String currency;
    @TableField("discount")
    private BigDecimal discount;
    @TableField("transfer_price")
    private BigDecimal transferPrice;
    @TableField("transfer_currency")
    private String transferCurrency;
    @TableField("sales_entity")
    private String salesEntity;
    @TableField("warehouse")
    private String warehouse;
    @TableField("location")
    private String location;
    @TableField("accumulative_sales_qty")
    private BigDecimal accumulativeSalesQty;

    public String getUniqueKey() {
        return StringUtils.defaultIfBlank(this.getPromotionType(), "null") +
                "|" +
                StringUtils.defaultIfBlank(this.getPartNo(), "null") +
                "|" +
                StringUtils.defaultIfBlank(this.getWarehouse(), "null") +
                "|" +
                StringUtils.defaultIfBlank(this.getLocation(), "null") +
                "|" +
                StringUtils.defaultIfBlank(this.getSalesEntity(), "null") +
                "|" +
                DateFormatUtils.format(this.getEffectiveFrom(),"yyyy-MM-dd HH:mm:ss")
                ;
    }

    public String getUniqueKeyExSaE() {
        return StringUtils.defaultIfBlank(this.getPromotionType(), "null") +
                "|" +
                StringUtils.defaultIfBlank(this.getPartNo(), "null") +
                "|" +
                StringUtils.defaultIfBlank(this.getWarehouse(), "null") +
                "|" +
                StringUtils.defaultIfBlank(this.getLocation(), "null") +
                "|" +
                DateFormatUtils.format(this.getEffectiveFrom(),"yyyy-MM-dd HH:mm:ss")
                ;
    }

}

package com.example.demo.dao;


import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 * 
 * </p>
 *
 * @author yangjf123
 * @since 2021-05-25
 */
public class WmsInboundDoItem extends Model<WmsInboundDoItem> {

    private static final long serialVersionUID = 1L;

    private Long id;
    /**
     * inbound delivery order number
     */

    private String inboundDoNo;
    /**
     * inbound delivery order item 
     */
    private String inboundDoItem;
    /**
     * inbound delivery order item status
     */
    private String inboundDoItemStatus;
    /**
     * inbound delivery order reason
     */
    private String inboundDoItemReason;
    /**
     * warehouse
     */
    private String warehouse;
    /**
     * location
     */
    private String location;
    /**
     * external warehouse
     */
    private String extWarehouse;
    /**
     * external location
     */
    private String extLocation;

    /**
     * quantity
     */
    private BigDecimal quantity;
    /**
     * unit of measure
     */
    private String uom;

    /**
     * carrier
     */
    private String carrier;
    /**
     * carrie name
     */
    private String carrierName;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInboundDoNo() {
        return inboundDoNo;
    }

    public void setInboundDoNo(String inboundDoNo) {
        this.inboundDoNo = inboundDoNo;
    }

    public String getInboundDoItem() {
        return inboundDoItem;
    }

    public void setInboundDoItem(String inboundDoItem) {
        this.inboundDoItem = inboundDoItem;
    }

    public String getInboundDoItemStatus() {
        return inboundDoItemStatus;
    }

    public void setInboundDoItemStatus(String inboundDoItemStatus) {
        this.inboundDoItemStatus = inboundDoItemStatus;
    }

    public String getInboundDoItemReason() {
        return inboundDoItemReason;
    }

    public void setInboundDoItemReason(String inboundDoItemReason) {
        this.inboundDoItemReason = inboundDoItemReason;
    }

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getExtWarehouse() {
        return extWarehouse;
    }

    public void setExtWarehouse(String extWarehouse) {
        this.extWarehouse = extWarehouse;
    }

    public String getExtLocation() {
        return extLocation;
    }

    public void setExtLocation(String extLocation) {
        this.extLocation = extLocation;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getCarrierName() {
        return carrierName;
    }

    public void setCarrierName(String carrierName) {
        this.carrierName = carrierName;
    }

}

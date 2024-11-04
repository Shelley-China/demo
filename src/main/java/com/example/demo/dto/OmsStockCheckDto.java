package com.example.demo.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Objects;

@Data
public class OmsStockCheckDto {

    private String soId;
    private String warehouse;
    private String location;
    private String partNo;
    private String subPart;
    private String subType;
    private String partType;
    private Integer priority;
    private Integer subPriority;
    private boolean pass;
    private BigDecimal quantity;
    private BigDecimal vipQty;
    private BigDecimal sbdQty;
    private BigDecimal warehouseOnHand;
    private BigDecimal totalReserved;
    private BigDecimal allocatedQty;
    private BigDecimal netQty;
    private BigDecimal useQty;
    private BigDecimal newAvailableQty;

    public OmsStockCheckDto() {
    }

    public OmsStockCheckDto(String soId, String warehouse, String location) {
        this.soId = soId;
        this.warehouse = warehouse;
        this.location = location;
    }

    @Override
    public int hashCode() {
        return Objects.hash(soId, warehouse, location);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OmsStockCheckDto omsStockCheckDto = (OmsStockCheckDto) o;
        return Objects.equals(soId, omsStockCheckDto.getSoId()) &&
                Objects.equals(warehouse, omsStockCheckDto.getWarehouse()) &&
                Objects.equals(location, omsStockCheckDto.getLocation());
    }
}

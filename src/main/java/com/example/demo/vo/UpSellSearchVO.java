package com.example.demo.vo;

import lombok.Data;

import java.util.List;

/**
 * @author zrh
 * @since 2021-10-12
 */
@Data
public class UpSellSearchVO {

    private String warehouseCode;

    private List<String> partNos;

    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode;
    }
    public String getWarehouseCode() {
        return warehouseCode;
    }

    public void setPartNos(List<String> partNos) {
        this.partNos = partNos;
    }
    public List<String> getPartNos() {
        return partNos;
    }

}

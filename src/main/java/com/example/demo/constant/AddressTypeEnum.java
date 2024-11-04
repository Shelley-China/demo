package com.example.demo.constant;

import java.util.Arrays;

public enum AddressTypeEnum {
    SHIP_TO("ShipTo","WE"),
    SOLD_TO("SoldTo","AG"),
    BILL_TO("BillTo","RE"),
    PAYER("Payer","RG"),
    PUDO("PUDO"),
    END_CUSTOMER("EndCustomer"),
    SHIP_FROM("ShipFrom"),
    LOCAL_TO("LocalTo"),
    ALTERNATE_SHIP_TO("AlternateShipTo");


    AddressTypeEnum(String addressType){
        this.addressType = addressType;
        this.sapType = null;
    }
    AddressTypeEnum(String addressType, String sapType){
        this.addressType = addressType;
        this.sapType = sapType;
    }

    private final String addressType;
    private final String sapType;


    public String getAddressType() {
        return addressType;
    }

    public String getSapType() {
        return sapType;
    }
}

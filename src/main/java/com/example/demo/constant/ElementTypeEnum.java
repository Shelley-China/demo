package com.example.demo.constant;

import com.baomidou.mybatisplus.annotation.EnumValue;

/**
 * @Author: lizhong7
 * @Since: 2024/3/21 11:23
 * @Version 1.0
 */
public enum ElementTypeEnum {
    B2B("List_Price"),
    B2C("List_Price_B2C"),
    PROM("Promotion_INW");

    @EnumValue
    public String code;

    ElementTypeEnum(String code) {
        this.code = code;
    }


    public static ElementTypeEnum of(String code) {
        for (ElementTypeEnum value : ElementTypeEnum.values()) {
            if (value.code.equalsIgnoreCase(code)) {
                return value;
            }
        }
        return null;
    }
}

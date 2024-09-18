package com.example.demo.controller;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PromotionDto {
    private String sellingType;
    private String promotionId;
    private BigDecimal qty;
    private BigDecimal price;
    private BigDecimal discount;
}

package com.example.demo.model;

import lombok.Builder;
import lombok.Data;

@Data

public class OrderDetail {

    private String customerItemNo;

    private String partNo;

    private String pieceQty;
}

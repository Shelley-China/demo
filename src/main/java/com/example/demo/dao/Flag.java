package com.example.demo.dao;

import lombok.Builder;
import lombok.Data;

@Data
public class Flag {
    private String messagetype = "";
    private String msdnumber = "";
    private String vendortype = "";
}

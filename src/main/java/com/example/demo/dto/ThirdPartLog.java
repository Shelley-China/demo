package com.example.demo.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ThirdPartLog {
    private String logType;
    private String requestUrl;
    private String requestParameter;
    private String requestHeader;
    private String requestBody;
    //接口调用方
    private String requestSender;
    //接口被调方
    private String requestReceiver;
    private String userAccount;
    private String responseCode;
    private String responseBody;
    //重试次数
    private String retryCount;
    //错误信息
    private String errorInfo;
    private String createdDate;
}

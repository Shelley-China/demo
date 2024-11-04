package com.example.demo.controller;

import cn.hutool.core.util.StrUtil;
import cn.hutool.crypto.digest.DigestUtil;
import cn.hutool.http.HttpResponse;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.model.OrderDetail;
import com.example.demo.model.ScsAsynProdDto;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class callHICTest {
    public static final String APPID = "lenovotestappid";
    public static final String NONCE = "123456";
    public static final String SECRET = "deLqcB8HGqq37Kgy";
    public static final String HICURL = "http://api-cap-uat.hichain.com/api/upsell/v1.0/asynProdSto";
    //callHICAppId: lenovotestappid
    //callHICNonce: 123456
    //callHICAppSecret: deLqcB8HGqq37Kgy
    //callHICUrl: http://api-cap-uat.hichain.com/api/upsell/v1.0/asynProdSto

    public static void main(String[] args) throws Exception {
        JSONObject hicJsonReq = getCreateMessageOrders();
        //Map<String, String> requestBody = new HashMap<>();
        //requestBody.put("customerNo", serviceOrder);
        //JSONObject hicJsonReq = (JSONObject) JSONObject.toJSON(requestBody);
        Map<String, String> headerMap = new HashMap<>();
        String timestamp = String.valueOf(System.currentTimeMillis());
        headerMap.put("appid", APPID);
        headerMap.put("timestamp", timestamp);
        headerMap.put("nonce", NONCE);
        String sign = DigestUtil.sha1Hex(StrUtil.concat(true, new CharSequence[]{APPID, SECRET, timestamp, NONCE, hicJsonReq.toString()}));
        headerMap.put("sign", sign);
        System.out.println("================OMS 调用【AP-HIC】请求报文 ：" + hicJsonReq.toJSONString());
        //HttpResponse responseAva = HttpClientUtil.doPost(HICURL, headerMap, hicJsonReq);
        //JSONObject obj = JSONObject.parseObject(EntityUtils.toString(responseAva.getEntity(), "UTF-8"));
        //System.out.println("================OMS 调用【AP-HIC】HIC返回值 ：" + obj.toJSONString());
    }

    public static JSONObject getCreateMessageOrders() {
        //创建request对象
        ScsAsynProdDto requestBody = new ScsAsynProdDto();
        List<OrderDetail> orderDetails = new ArrayList<>();

        // customerNo取自oms_so_address表的bp_id字段(限定条件:partner_type='ShipTo')
        requestBody.setCustomerNo("");
        //oms_so_fulfills .get(0).getIssueWarehouse()
        requestBody.setShipFromWmsCode("");
        //omsSoHeader.getDefaultWarehouse()
        requestBody.setShipToWmsCode("");
        //循环item
        for (int i = 0; i < 1; i++) {
            OrderDetail orderDetail = new OrderDetail();
            orderDetail.setCustomerItemNo("");
            orderDetail.setPartNo("");
            orderDetail.setPieceQty("");
            orderDetails.add(orderDetail);
        }
        requestBody.setOrderDetails(orderDetails);
        JSONObject jsonObj = (JSONObject) JSONObject.toJSON(requestBody);
        System.out.println("====================生成call AP-HIC报文：" + jsonObj.toJSONString());
        return jsonObj;
    }
}

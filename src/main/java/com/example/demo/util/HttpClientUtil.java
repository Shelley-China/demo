package com.example.demo.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URI;
import java.util.*;

/**
 * httpClientUtil
 */
public class HttpClientUtil {

    /**
     * @param url
     * @param head
     * @param request
     * @return response
     * @throws Exception
     */
    public static HttpResponse doPost(String url, Map<String, String> head, Object request) throws Exception {
        HttpPost httpPost = new HttpPost();
        httpPost.setURI(new URI(url));
        httpPost.addHeader(HTTP.CONTENT_TYPE, "application/json");
        if (ToolUtil.isNotEmpty(head)) {
            for (Map.Entry<String, String> headEntry : head.entrySet()) {
                httpPost.setHeader(headEntry.getKey(), headEntry.getValue());
            }
        }
        //构建Request
        String jsonRequest = JSON.toJSONString(request, SerializerFeature.DisableCircularReferenceDetect);
        StringEntity requestEntity = new StringEntity(jsonRequest);
        httpPost.setEntity(requestEntity);
        CloseableHttpClient httpClient = HttpClientFactory.createHttpClient();
        return httpClient.execute(httpPost);
    }

}

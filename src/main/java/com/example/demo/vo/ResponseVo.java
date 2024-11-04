//package com.example.demo.vo;//
//// Source code recreated from a .class file by IntelliJ IDEA
//// (powered by FernFlower decompiler)
////
//
//
//import com.example.demo.vo.ErrorResponseVo;
//import com.fasterxml.jackson.annotation.JsonCreator;
//import com.fasterxml.jackson.annotation.JsonInclude;
//import com.fasterxml.jackson.annotation.JsonProperty;
//import com.fasterxml.jackson.annotation.JsonInclude.Include;
//import java.io.Serializable;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public final class ResponseVo<T> implements Serializable {
//
//    @JsonInclude(Include.NON_NULL)
//    private Boolean success;
//    @JsonInclude(Include.NON_NULL)
//    private String requestId;
//    @JsonInclude(Include.NON_NULL)
//    private ErrorResponseVo error;
//    @JsonProperty("data")
//    private T data;
//
//    private ResponseVo(Boolean success, ErrorResponseVo error, T data) {
//        this.success = success;
//        this.error = error;
//        this.data = data;
//    }
//
//    /** @deprecated */
//    @Deprecated
//    @JsonCreator
//    public static <T> ResponseVo deserialization(@JsonProperty("success") Boolean success, @JsonProperty("error") ErrorResponseVo error, @JsonProperty("data") T data) {
//        return new ResponseVo(success, error, data);
//    }
//
//    //public static <T> ResponseVo<T> success() {
//    //    return success((Object)null);
//    //}
//
//    public static ResponseVo<Map> success(String key, Object value) {
//        Map<String, Object> map = new HashMap();
//        map.put(key, value);
//        return success(map);
//    }
//
//    public static <T> ResponseVo<T> success(T data) {
//        return new ResponseVo(Boolean.TRUE, (ErrorResponseVo)null, data == null ? new HashMap() : data);
//    }
//
//    public static <T> ResponseVo<T> error(Integer code, String message, String longMessage, String source, T data) {
//        return new ResponseVo(Boolean.FALSE, ErrorResponseVo.builder().code(code).message(message).longMessage(longMessage).source(source).build(), data == null ? new HashMap() : data);
//    }
//
//    public static <T> ResponseVo<T> error(Integer code, String message, String longMessage, String source, T data, List<BindErrorVo> bindError) {
//        return new ResponseVo(Boolean.FALSE, ErrorResponseVo.builder().code(code).message(message).longMessage(longMessage).source(source).bindError(bindError).build(), data == null ? new HashMap() : data);
//    }
//
//    public static <T> ResponseVo<T> error(Integer code, String message, T data) {
//        return error(code, message, data, (List)null);
//    }
//
//    public static <T> ResponseVo<T> error(Integer code, String message, T data, List<BindErrorVo> bindError) {
//        return error(code, message, (String)null, (String)null, data, bindError);
//    }
//
//    public void setRequestId(String requestId) {
//        this.requestId = requestId;
//    }
//
//    public Boolean getSuccess() {
//        return this.success;
//    }
//
//    public String getRequestId() {
//        return this.requestId;
//    }
//
//    public ErrorResponseVo getError() {
//        return this.error;
//    }
//
//    public T getData() {
//        return this.data;
//    }
//}

package com.example.demo.vo;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//


import com.example.demo.vo.BindErrorVo;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.io.Serializable;
import java.util.List;

public final class ErrorResponseVo implements Serializable {

    @JsonInclude(Include.NON_NULL)
    private Integer code;

    @JsonInclude(Include.NON_NULL)
    private String message;
    @JsonInclude(Include.NON_NULL)
    private String longMessage;
    @JsonInclude(Include.NON_NULL)
    private String source;
    @JsonInclude(Include.NON_NULL)
    private List<BindErrorVo> bindError;

    public ErrorResponseVo(Integer code, String message, String longMessage, String source, List<BindErrorVo> bindError) {
        this.code = code;
        this.message = message;
        this.longMessage = longMessage;
        this.source = source;
        this.bindError = bindError;
    }

    /** @deprecated */
    @Deprecated
    @JsonCreator
    public static ErrorResponseVo deserialization(@JsonProperty("code") Integer code, @JsonProperty("message") String message, @JsonProperty("long-message") String longMessage, @JsonProperty("source") String source, @JsonProperty("bind-error") List<BindErrorVo> bindError) {
        return builder().code(code).message(message).longMessage(longMessage).source(source).bindError(bindError).build();
    }

    public static ErrorResponseVo.ErrorResponseVoBuilder builder() {
        return new ErrorResponseVo.ErrorResponseVoBuilder();
    }

    public Integer getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public String getLongMessage() {
        return this.longMessage;
    }

    public String getSource() {
        return this.source;
    }

    public List<BindErrorVo> getBindError() {
        return this.bindError;
    }

    public static class ErrorResponseVoBuilder {
        private Integer code;
        private String message;
        private String longMessage;
        private String source;
        private List<BindErrorVo> bindError;

        ErrorResponseVoBuilder() {
        }

        public ErrorResponseVo.ErrorResponseVoBuilder code(Integer code) {
            this.code = code;
            return this;
        }

        public ErrorResponseVo.ErrorResponseVoBuilder message(String message) {
            this.message = message;
            return this;
        }

        public ErrorResponseVo.ErrorResponseVoBuilder longMessage(String longMessage) {
            this.longMessage = longMessage;
            return this;
        }

        public ErrorResponseVo.ErrorResponseVoBuilder source(String source) {
            this.source = source;
            return this;
        }

        public ErrorResponseVo.ErrorResponseVoBuilder bindError(List<BindErrorVo> bindError) {
            this.bindError = bindError;
            return this;
        }

        public ErrorResponseVo build() {
            return new ErrorResponseVo(this.code, this.message, this.longMessage, this.source, this.bindError);
        }

        public String toString() {
            return "ErrorResponseVo.ErrorResponseVoBuilder(code=" + this.code + ", message=" + this.message + ", longMessage=" + this.longMessage + ", source=" + this.source + ", bindError=" + this.bindError + ")";
        }
    }
}

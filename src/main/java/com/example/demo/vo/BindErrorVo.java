package com.example.demo.vo;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public final class BindErrorVo {

    @JsonInclude(Include.NON_NULL)
    private String field;

    @JsonInclude(Include.NON_NULL)
    private String msg;

    public String getField() {
        return this.field;
    }

    public String getMsg() {
        return this.msg;
    }

    public BindErrorVo() {
    }

    public BindErrorVo(String field, String msg) {
        this.field = field;
        this.msg = msg;
    }
}

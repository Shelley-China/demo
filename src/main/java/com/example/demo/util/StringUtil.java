package com.example.demo.util;

import cn.hutool.core.convert.Convert;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.Objects;
import java.util.function.Supplier;

public class StringUtil {
    /**
     * 多字段拼接Key
     * 如果字段为空，拼接"null"字符串
     * @param split 分隔符
     * @param args 动态字段
     * @return
     */
    public static String groupKey(String split,Object... args) {
        return groupKey(false, split, args);
    }

    /**
     * 多字段拼接Key
     * @param blankToEmpty 如果字段为空，拼接"null"字符串 or 拼接空字符串
     * @param split 分隔符
     * @param args 动态字段
     * @return
     */
    public static String groupKey(Boolean blankToEmpty,String split,Object... args) {
        if(Objects.isNull(split) || Objects.isNull(args)){
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < args.length; i++){
            if(ToolUtil.isEmpty(args[i])){
                if(!blankToEmpty) {
                    sb.append("null");
                }
            }else {
                sb.append(Convert.toStr(args[i]));
            }
            if(i < args.length - 1){
                sb.append(split);
            }
        }
        return sb.toString();
    }


    public static boolean anyMatch(String source, String... target){
        for (String s : target) {
            if(Objects.equals(source, s)){
                return true;
            }
        }
        return false;
    }

    public static boolean nonMatch(String source, String... target){
        for (String s : target) {
            if(Objects.equals(source, s)){
                return false;
            }
        }
        return true;
    }

    public static boolean anyOverSize(int size, String... target){
        for (String s : ArrayUtils.nullToEmpty(target)) {
            if(StringUtils.length(s) > size){
                return true;
            }
        }
        return false;
    }

    public static boolean anyUnderSize(int size, String... target){
        for (String s : ArrayUtils.nullToEmpty(target)) {
            if(StringUtils.length(s) < size){
                return true;
            }
        }
        return false;
    }

    public static boolean totalOverSize(int size, String... target){
        Integer i = Arrays.stream(ArrayUtils.nullToEmpty(target)).map(StringUtils::length).reduce(Integer::sum).orElse(0);
        return i > size;
    }

    public static boolean totalUnderSize(int size, String... target){
        Integer i = Arrays.stream(ArrayUtils.nullToEmpty(target)).map(StringUtils::length).reduce(Integer::sum).orElse(0);
        return i < size;
    }

    @SafeVarargs
    public static String getIfBlank(String source, Supplier<String>... supplier){
        if(StringUtils.isNotBlank(source)){
            return source;
        }
        if(ToolUtil.isEmpty(supplier)){
            return source;
        }
        for (Supplier<String> stringSupplier : supplier) {
            String s = stringSupplier.get();
            if(ToolUtil.isNotEmpty(s)){
                return s;
            }
        }
        return source;
    }
    @SafeVarargs
    public static String getIfBlank(String source, String defaultValue, Supplier<String>... supplier){
        String ifBlank = getIfBlank(source, supplier);
        return StringUtils.defaultIfBlank(ifBlank, defaultValue);
    }

    public static boolean equals(String source, String target){
        return StringUtils.equals(
                StringUtils.defaultString(source),
                StringUtils.defaultString(target)
        );
    }

    public static String concat(String... str){
        return StringUtils.join(ArrayUtils.nullToEmpty(str), "");
    }
}

package com.example.demo.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.apache.commons.lang3.ObjectUtils;

import java.math.BigDecimal;
import java.util.LinkedHashSet;
import java.util.Map;

@Data
//@Builder
@TableName("student")
public class Student1 {

    @TableId(value = "id")
    String id;

    @TableField("name")
    String name;

    @TableField("age")
    Integer age;


    Boolean check;

    private Integer priority;
    private BigDecimal netAfsQty;

    private Map<String, LinkedHashSet<String>> segmentHierarchicalMap;

    public Student1(){

    }

    public Student1(String name) {
        this.name = name;
    }
    public Student1(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public Student1(String id, Integer age) {
        this.id = id;
        this.age = age;
    }

    public Integer getPriorityWithDefault() {
        return ObjectUtils.defaultIfNull(priority, 0);
    }
}

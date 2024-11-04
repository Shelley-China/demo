package com.example.demo.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@TableName("teacher")
public class Teacher {

    @TableId(value = "id")
    String id;

    @TableField("name")
    String name;

    @TableField("class_name")
    String className;

    public Teacher() {
    }

    public Teacher(String id, String name, String className) {
        this.id = id;
        this.name = name;
        this.className = className;
    }
}

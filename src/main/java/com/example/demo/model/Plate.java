package com.example.demo.model;

/**
 * Description:
 * Created by lizhong7 on 2022/3/22 18:12
 */
public class Plate<T> {
    private T item;
    public Plate(T t){
        this.item = t;
    }
    public T get(){
        return item;
    }
    public void set(T item){
        this.item = item;
    }
}

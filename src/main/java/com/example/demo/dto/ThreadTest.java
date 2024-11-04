package com.example.demo.dto;

import kotlin.coroutines.jvm.internal.RunSuspendKt;

/**
 * @Author: lizhong7
 * @Since: 2024/9/19 11:38
 * @Version 1.0
 */
public class ThreadTest implements Runnable {

    private volatile static Integer i = 0;
    private static Object o1 = new Object();

    @Override
    public void run() {
        try {
            for (int j = 0; j < 50; j++) {
                Thread.sleep(100);
                synchronized (o1) {
                    i++;
                    System.out.println(Thread.currentThread().getName() + ":" + i);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ThreadTest tt1 = new ThreadTest();
        ThreadTest tt2 = new ThreadTest();
        Thread t1 = new Thread(tt1);
        Thread t2 = new Thread(tt2);
        t1.start();
        t2.start();
    }

}

package com.example.demo.util.sort;

import java.util.Arrays;
/*
    冒泡排序就是冒泡泡...

    平均时间复杂度：O(n^2)
    最好情况：O(n) ：也就是第一遍flag就等于true的情况
    最坏情况：O(n^2) ：也就是好几遍flag都不等于true(捂脸)
    空间复杂度：O(1) ：理论上不需要额外的内存空间
    是一种稳定算法
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 2, 6, 7, 3, 1, 9};
        try {
            int[] sortArr = sort(arr);
            System.out.println("arr" + Arrays.toString(arr));
            System.out.println("sortArr" + Arrays.toString(sortArr));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int[] sort(int[] sourceArray) throws Exception {
        // 对 arr 进行拷贝，不改变参数内容
        int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);
        for (int i = 1; i < arr.length; i++) {
            // 设定一个标记，若为true，则表示此次循环没有进行交换，也就是待排序列已经有序，排序已经完成。
            boolean flag = true;
            for (int j = 0; j < arr.length - i; j++) { // -i是重点
                if (arr[j] > arr[j + 1]) {
                    //i=1 5,2,6,7,3,1,9
                    //i=2 2,5,6,3,1,7,9
                    //i=3 2,5,3,1,6,7,9
                    //i=4 2,3,1,5,6,7,9
                    //i=5 2,1,3,5,6,7,9
                    //i=6 1,2,3,5,6,7,9
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;

                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
        return arr;
    }
}

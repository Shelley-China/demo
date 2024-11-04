package com.example.demo.util.sort;

import java.util.Arrays;

/*
    希尔排序是对插入排序的优化
    具体优化措施是：
    1，先取一个小于n的整数d1作为第一个增量(一般d1为length/2)，把文件的全部记录分成d1个组。
    所有距离为d1的倍数的记录放在同一个组中，先在各组内进行直接插入排序；
    然后，取第二个增量d2......
    增量不断的缩小，最终为1，这时候就是纯纯的插入排序了。

    平均时间复杂度：O(n^1.3)
    最好情况：O(n) ：
    最坏情况：O(n^2) ：
    空间复杂度：O(1) ：理论上不需要额外的内存空间

    是一种不稳定的算法

 */
public class ShellSort {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 2, 6, 4, 3, 1, 9};
        try {
            int[] sortArr = sort(arr);
            System.out.println("arr" + Arrays.toString(arr));
            System.out.println("sortArr" + Arrays.toString(sortArr));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int[] sort(int[] arr) {
        int length = arr.length;
        int temp;
        for (int step = length / 2; step >= 1; step /= 2) {
            //代码和插入排序很像，其实就是跨步为d的插入排序
            for (int i = step; i < length; i++) {
                temp = arr[i];
                int j = i - step;
                while (j >= 0 && arr[j] > temp) {
                    arr[j + step] = arr[j];
                    j -= step;
                }
                arr[j + step] = temp;
            }
        }
        return arr;
    }
}

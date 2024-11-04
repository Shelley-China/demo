package com.example.demo.util.sort;

import java.util.Arrays;

/*
    堆排序，下面这个链接的视频讲的挺好的：
    https://www.bilibili.com/video/BV1Eb41147dK?from=search&seid=3295186517797064190&spm_id_from=333.337.0.0
    堆排序（Heapsort）是指利用堆这种数据结构所设计的一种排序算法。堆是一个近似完全二叉树的结构，
    并同时满足堆的性质：即子结点的键值或索引总是小于（或者大于）它的父节点。(可以说堆本身就是暗含排序的这么一个东西)
    堆排序可以说是一种利用堆的概念来排序的选择排序。分为两种方法：
    大顶堆：每个节点的值都大于或等于其子节点的值，在堆排序算法中用于升序排列；
    小顶堆：每个节点的值都小于或等于其子节点的值，在堆排序算法中用于降序排列；
    堆排序的平均时间复杂度为 Ο(nlogn)。

    算法步骤
    1.创建一个堆 H[0……n-1]；
    2.把堆首（最大值）和堆尾互换；
    3.把堆的尺寸缩小 1，并调用 shift_down(0)，目的是把新的数组顶端数据调整到相应位置；
    4.重复步骤 2，直到堆的尺寸为 1。

    平均时间复杂度：O(nlog₂n)
    最好情况：O(nlog₂n) ：
    最坏情况：O(nlog₂n) ：
    空间复杂度：O(1) ：理论上不需要额外的内存空间

    是一种不稳定的算法

 */
public class HeapSort {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 2, 6, 4, 3, 1, 9};
        //int[] arr = new int[]{2, 1, 3};
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
        int len = arr.length;

        buildMaxHeap(arr, len);

        for (int i = len - 1; i > 0; i--) {
            swap(arr, 0, i);
            len--;
            heapify(arr, 0, len);
        }
        return arr;
    }

    private static void buildMaxHeap(int[] arr, int len) {
        for (int i = (int) Math.floor(len / 2); i >= 0; i--) {//这样得到的i是堆的最后一个parent的index
            heapify(arr, i, len);
        }
    }

    //参数i表示要对parent为 i 的那个三角做heapify
    //2 * i + 1表示左子节点，2 * i + 2表示右子节点
    private static void heapify(int[] arr, int i, int len) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int largest = i;
        //加条件left < len是为了防止出界，
        if (left < len && arr[left] > arr[largest]) {
            largest = left;
        }
        //加条件right < len是为了防止出界，
        if (right < len && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != i) {
            swap(arr, i, largest);
            heapify(arr, largest, len);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

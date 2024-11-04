package com.example.demo.util.sort;

import java.util.Arrays;

/*
    不用看下面的步骤，直接看算法就好了，这个算法写的挺明白的
    归并排序运用了递归的思想
    归并排序算法步骤：
    1，申请空间，使其大小为两个已经排序序列之和，该空间用来存放合并后的序列；
    2，设定两个指针，最初位置分别为两个已经排序序列的起始位置；
    3，比较两个指针所指向的元素，选择相对小的元素放入到合并空间，并移动指针到下一位置；
    4，重复步骤 3 直到某一指针达到序列尾；,
    5，将另一序列剩下的所有元素直接复制到合并序列尾。

    归并排序的时间复杂度可以用下面视频中讲解的master公式来套
    https://www.bilibili.com/video/BV13g41157hK?p=3
    平均时间复杂度：O(nlog₂n)
    最好情况：O(nlog₂n)
    最坏情况：O(nlog₂n)
    空间复杂度：O(n) ：需要额外的内存空间

    是一种稳定的算法

    归并排序是目前平均时间复杂度最低的排序算法，也是目前空间复杂度最高的算法...
    原理相对比较简单
 */
public class MergeSort {

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

    public static int[] sort(int[] sourceArray) throws Exception {
        // 对 arr 进行拷贝，不改变参数内容
        int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);

        if (arr.length < 2) {
            return arr;
        }
        int middle = (int) Math.floor(arr.length / 2);

        int[] left = Arrays.copyOfRange(arr, 0, middle);
        int[] right = Arrays.copyOfRange(arr, middle, arr.length);

        return merge(sort(left), sort(right));
    }

    protected static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0;
        while (left.length > 0 && right.length > 0) {
            if (left[0] <= right[0]) {
                result[i++] = left[0];
                left = Arrays.copyOfRange(left, 1, left.length);
            } else {
                result[i++] = right[0];
                right = Arrays.copyOfRange(right, 1, right.length);
            }
        }

        while (left.length > 0) {
            result[i++] = left[0];
            left = Arrays.copyOfRange(left, 1, left.length);
        }

        while (right.length > 0) {
            result[i++] = right[0];
            right = Arrays.copyOfRange(right, 1, right.length);
        }

        return result;
    }
}

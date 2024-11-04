package com.example.demo.util.sort;

import java.util.Arrays;

/*
    计数排序，下面这个链接的视频讲的挺好的：
    https://www.bilibili.com/video/BV1Wb41157ed?from=search&seid=11394647229482351068&spm_id_from=333.337.0.0
    通常认为计数排序是桶排序思想的基础版
    计数排序不是一个比较排序算法，该算法于1954年由 Harold H. Seward提出，通过计数将时间复杂度降到了O(N+K)
    k一般比较小，所以也可以认为时间复杂度是O(N)
    适用场景：待排序数据量大但是数据范围小，例如：
    1，某大型企业数万名员工年龄排序
    2，如何快速得知高考名次(腾讯面试题)

    算法的步骤如下：
    （1）找出待排序的数组中最大和最小的元素(目的是为了确定计数数组的长度)
    （2）统计数组中每个值为i的元素出现的次数，存入数组C的第i项
    （3）对所有的计数累加（从C中的第一个元素开始，每一项和前一项相加）
    （4）反向填充目标数组：将每个元素i放在新数组的第C(i)项，每放一个元素就将C(i)减去1

    平均时间复杂度：O(N+K) N为原数组长度，K为计数数组长度
    最好情况：O(N+K) ：
    最坏情况：O(N+K) ：
    空间复杂度：O(N+K) ：

    是一种不稳定的算法

 */
public class CountingSort {
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
        int maxValue = getMaxValue(arr);
        return countingSort(arr, maxValue);
    }

    private static int[] countingSort(int[] arr, int maxValue) {
        int bucketLen = maxValue + 1;
        int[] bucket = new int[bucketLen];

        for (int value : arr) {
            bucket[value]++;
        }

        int sortedIndex = 0;
        for (int j = 0; j < bucketLen; j++) {
            while (bucket[j] > 0) {
                arr[sortedIndex++] = j;
                bucket[j]--;
            }
        }
        return arr;
    }

    private static int getMaxValue(int[] arr) {
        int maxValue = arr[0];
        for (int value : arr) {
            if (maxValue < value) {
                maxValue = value;
            }
        }
        return maxValue;
    }
}

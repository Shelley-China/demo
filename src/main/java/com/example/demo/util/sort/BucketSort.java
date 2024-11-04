package com.example.demo.util.sort;

import java.util.Arrays;

/*
    桶排序，下面这个链接的视频讲的挺好的：
    https://www.bilibili.com/video/BV1A4411N7cG?from=search&seid=5177398301770055350&spm_id_from=333.337.0.0
    桶排序是计数排序的升级版。它利用了函数的映射关系，高效与否的关键就在于这个映射函数的确定。为了使桶排序更加高效，我们需要做到这两点：

    1.在额外空间充足的情况下，尽量增大桶的数量
    2.使用的映射函数能够将输入的 N 个数据均匀的分配到 K 个桶中
    同时，对于桶中元素的排序，选择何种比较排序算法对于性能的影响至关重要。

    1. 什么时候最快
    当输入的数据可以均匀的分配到每一个桶中。
    2. 什么时候最慢
    当输入的数据被分配到了同一个桶中。
    3. 示意图
    元素分布在桶中：
    然后，元素在每个桶中排序：

    平均时间复杂度：O(N) N为原数组长度，K为计数数组长度
    最好情况：O(N) ：
    最坏情况：O(N^2) ：
    空间复杂度：O(N+K) ：

    是一种稳定的算法

 */
public class BucketSort {
    private static final InsertSort insertSort = new InsertSort();
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

        return bucketSort(arr, 5);
    }

    private static int[] bucketSort(int[] arr, int bucketSize) throws Exception {
        if (arr.length == 0) {
            return arr;
        }

        int minValue = arr[0];
        int maxValue = arr[0];
        for (int value : arr) {
            if (value < minValue) {
                minValue = value;
            } else if (value > maxValue) {
                maxValue = value;
            }
        }

        int bucketCount = (int) Math.floor((maxValue - minValue) / bucketSize) + 1;
        int[][] buckets = new int[bucketCount][0];

        // 利用映射函数将数据分配到各个桶中
        for (int i = 0; i < arr.length; i++) {
            int index = (int) Math.floor((arr[i] - minValue) / bucketSize);
            buckets[index] = arrAppend(buckets[index], arr[i]);
        }

        int arrIndex = 0;
        for (int[] bucket : buckets) {
            if (bucket.length <= 0) {
                continue;
            }
            // 对每个桶进行排序，这里使用了插入排序
            bucket = insertSort.sort(bucket);
            for (int value : bucket) {
                arr[arrIndex++] = value;
            }
        }

        return arr;
    }

    /**
     * 自动扩容，并保存数据
     *
     * @param arr
     * @param value
     */
    private static int[] arrAppend(int[] arr, int value) {
        arr = Arrays.copyOf(arr, arr.length + 1);
        arr[arr.length - 1] = value;
        return arr;
    }
}

package com.example.demo.util.sort;

import java.util.Arrays;

/*
    基数排序，下面这个链接的视频讲的挺好的：
    https://www.bilibili.com/video/BV184411L79P?from=search&seid=2469627344706930834&spm_id_from=333.337.0.0
    基数排序也是非比较排序，桶思想的一种，多关键字排序
    基数排序的每一轮都是计数排序，多轮计数排序就是基数排序
    先根据个位数排序将各个数字放进桶里，然后再依次从桶里倒出来，再根据十位数排序将各个数字放进桶里，然后再依次从桶里倒出来，直至最高位
    最后倒出来的就是排好序的数字

    基数排序 vs 计数排序 vs 桶排序
    这三种排序算法都利用了桶的概念，但对桶的使用方法上有明显差异：
    基数排序：根据键值的每位数字来分配桶；
    计数排序：每个桶只存储单一键值；
    桶排序：每个桶存储一定范围的数值；

    平均时间复杂度：O(N*K) N为原数组长度，K为计数数组长度
    最好情况：O(N*K) ：
    最坏情况：O(N*K) ：
    空间复杂度：O(N*K) ：N为原数组长度，K为计数排序的轮数，
    可以加入一些编程技巧，将额外使用的空间控制为一个额外数组，也就是说空间复杂度可以降为O(N);

    是一种稳定的算法，因为每次都是从左到右的复制

 */
public class RadixSort {
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

        int maxDigit = getMaxDigit(arr);
        return radixSort(arr, maxDigit);
    }

    /**
     * 获取最高位数
     */
    private static int getMaxDigit(int[] arr) {
        int maxValue = getMaxValue(arr);
        return getNumLenght(maxValue);
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

    protected static int getNumLenght(long num) {
        if (num == 0) {
            return 1;
        }
        int lenght = 0;
        for (long temp = num; temp != 0; temp /= 10) {
            lenght++;
        }
        return lenght;
    }

    private static int[] radixSort(int[] arr, int maxDigit) {
        int mod = 10;
        int dev = 1;

        for (int i = 0; i < maxDigit; i++, dev *= 10, mod *= 10) {
            // 考虑负数的情况，这里扩展一倍队列数，其中 [0-9]对应负数，[10-19]对应正数 (bucket + 10)
            int[][] counter = new int[mod * 2][0];

            for (int j = 0; j < arr.length; j++) {
                int bucket = ((arr[j] % mod) / dev) + mod;
                counter[bucket] = arrayAppend(counter[bucket], arr[j]);
            }

            int pos = 0;
            for (int[] bucket : counter) {
                for (int value : bucket) {
                    arr[pos++] = value;
                }
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
    private static int[] arrayAppend(int[] arr, int value) {
        arr = Arrays.copyOf(arr, arr.length + 1);
        arr[arr.length - 1] = value;
        return arr;
    }
}

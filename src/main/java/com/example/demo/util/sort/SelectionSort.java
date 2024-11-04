package com.example.demo.util.sort;

import java.util.Arrays;

/*
    选择排序就简单多了...每次都挑选剩余未排序的数组中最大or最小的数字与当前max or min比较and替换
    所以它的复杂度一直都是O(n^2)

    平均时间复杂度：O(n^2)
    最好情况：O(n^2)
    最坏情况：O(n^2)
    空间复杂度：O(1) ：理论上不需要额外的内存空间

    选择排序的不稳定例子很简单:
    比如A 80 B 80 C 70 这三个卷子从小到大排序
    第一步会把C和A做交换 变成C B A
    第二步和第三步不需要再做交换了。所以排序完是C B A
    但是稳定的排序应该是C A B
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 2, 6, 1, 3, 1, 9};
        try {
            int[] sortArr = sort(arr);
            System.out.println("arr" + Arrays.toString(arr));
            System.out.println("sortArr" + Arrays.toString(sortArr));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int[] sort(int[] sourceArray) throws Exception {
        int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);

        // 总共要经过 N-1 轮比较
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;

            // 每轮需要比较的次数 N-i
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    // 记录目前能找到的最小值元素的下标
                    min = j;
                }
            }

            // 将找到的最小值和i位置所在的值进行交换
            if (i != min) {
                int tmp = arr[i];
                arr[i] = arr[min];
                arr[min] = tmp;
            }

        }
        return arr;
    }
}

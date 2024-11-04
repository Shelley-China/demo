package com.example.demo.util.sort;

import java.util.Arrays;

/*
    别多想，快排就是你想的那个：两个小哨兵，一个从左往右找大于基准值的，一个从右往左找小于基准值的
    https://www.cnblogs.com/skywang12345/p/3596746.html 这个博客讲的挺清楚
    业界对快排的评价还是挺高的：
    快速排序又是一种分而治之思想在排序算法上的典型应用。本质上来看，快速排序应该算是在冒泡排序基础上的递归分治法。
    快速排序的名字起的是简单粗暴，因为一听到这个名字你就知道它存在的意义，就是快，而且效率高！它是处理大数据最快的排序算法之一了。
    虽然 Worst Case 的时间复杂度达到了 O(n²)，但是人家就是优秀，在大多数情况下都比平均时间复杂度为 O(n logn) 的排序算法
    表现要更好，可是这是为什么呢，我也不知道。好在我的强迫症又犯了，查了 N 多资料终于在《算法艺术与信息学竞赛》上找到了满意的答案：
    快速排序的最坏运行情况是 O(n²)，比如说顺序数列的快排。但它的平摊期望时间是 O(nlogn)，且 O(nlogn) 记号中隐含的常数因子很小，
    比复杂度稳定等于 O(nlogn) 的归并排序要小很多。所以，对绝大多数顺序性较弱的随机数列而言，快速排序总是优于归并排序。

    算法步骤
    1.从数列中挑出一个元素，称为 "基准"（pivot）;
    2.重新排序数列，所有元素比基准值小的摆放在基准前面，所有元素比基准值大的摆在基准的后面（相同的数可以到任一边）。
      在这个分区退出之后，该基准就处于数列的中间位置。这个称为分区（partition）操作；
    3.递归地（recursive）把小于基准值元素的子数列和大于基准值元素的子数列排序；

    平均时间复杂度：O(nlog₂n)
    最好情况：O(nlog₂n) ：
    最坏情况：O(n^2) ：
    空间复杂度：O(nlog₂n) ：理论上不需要额外的内存空间

    是一种不稳定的算法

 */
public class QuickSort {
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
        return quickSort(arr, 0, arr.length - 1);
    }

    private static int[] quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int partitionIndex = partition(arr, left, right);
            quickSort(arr, left, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, right);
        }
        return arr;
    }

    private static int partition(int[] arr, int left, int right) {
        // 设定基准值（pivot）
        int pivot = left;
        int index = pivot + 1;
        for (int i = index; i <= right; i++) {
            if (arr[i] < arr[pivot]) {
                //这里为什么要交换，举个例子就懂了{2, 3, 4, 5, 6, 7, 1}
                //当i指向最后一个数字1的时候，才满足arr[i] < arr[pivot]，这时候index还是指向3，就将3和1交换
                //变成{2, 1, 4, 5, 6, 7, 3}，此时index=2,即指向4
                //使得index的前⼀位总是当前最后⼀个⼩于主轴的元素
                swap(arr, i, index);
                index++;
            }
        }
        //将arr数组的pivot位置和当前最后⼀个⼩于主轴的元素交换
        swap(arr, pivot, index - 1);
        return index - 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

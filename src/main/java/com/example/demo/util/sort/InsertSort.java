package com.example.demo.util.sort;

import java.util.Arrays;

/*
    插入排序就像打牌，将第一待排序序列第一个元素看做一个有序序列，把第二个元素到最后一个元素当成是未排序序列。
    从头到尾依次扫描未排序序列，将扫描到的每个元素插入有序序列的适当位置。（如果待插入的元素与有序序列中的某个元素相等，则将待插入元素插入到相等元素的后面。）

    平均时间复杂度：O(n^2)
    最好情况：O(n) ：也就是第一遍flag就等于true的情况
    最坏情况：O(n^2) ：也就是好几遍flag都不等于true(捂脸)
    空间复杂度：O(1) ：理论上不需要额外的内存空间

    是一种稳定的算法

    插入排序时间空间稳定性等各方面都与冒泡排序一致，但是代码实现难度比冒泡大，所以它和冒泡之间选择冒泡
    额...真的看懂了之后难度好像也没那么大，所以记得要看注释

 */
public class InsertSort {
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

        // 从下标为1的元素开始选择合适的位置插入，因为下标为0的只有一个元素，默认是有序的
        for (int i = 1; i < arr.length; i++) {

            // 记录要插入的数据
            int tmp = arr[i];
            // 从已经排序的序列最右边的开始比较，找到比其小的数
            int j = i;
            while (j > 0 && tmp < arr[j - 1]) {//时刻记住插入排序跟打牌一样！
                //5, 2, 6, 4, 3, 1, 9
                arr[j] = arr[j - 1];
                j--;
            }

            // 存在比其小的数，插入
            if (j != i) {
                arr[j] = tmp;
            }

        }
        return arr;
    }
}

package com.github.andydrew.learnAlgorithm;

import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        long x = System.currentTimeMillis();
        int[] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(200);
        }
        BubbleSort bs = new BubbleSort();
        bs.bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                System.out.print(arr[i] + ",");
            } else {
                System.out.println(arr[i]);
            }
        }
        x = System.currentTimeMillis() - x;
        System.out.println("运行时间" + x + "毫秒");
    }

    public int[] bubbleSort(int[] arr) {
        int count = 0;//int[] arr = {23, 232, 66, 33, 67};如n=5
        for (int i = 0; i < arr.length - 1; i++) {//冒泡排序外循环，循环次数为数组元素个数n-1=4
            count = arr.length - i - 1;
            for (int j = 0; j < count; j++) {//冒泡排序内循环，循环次数为逐次n-i
                if (arr[j] > arr[j + 1]) {//若前一个元素大于后一个元素
                    int a = arr[j];//a等于前一个元素
                    int b = arr[j + 1];//b等于后一个元素
                    arr[j] = b;//位置互动调
                    arr[j + 1] = a;
                }
            }
        }
        return arr;
    }
}

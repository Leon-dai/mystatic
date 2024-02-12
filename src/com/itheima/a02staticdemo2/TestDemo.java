package com.itheima.a02staticdemo2;

public class TestDemo {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        String res = ArrayUtil.printArr(arr1);
        System.out.println(res);

        double[] arr2 = {1.1, 2.3, 4.5, 6.8, 9.1};
        double average = ArrayUtil.getAverage(arr2);
        System.out.println(average);
    }
}

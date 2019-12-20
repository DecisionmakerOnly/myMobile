package com.it.java.array;

/**
 * @author ljh
 * @create 2019-12-19
 */
public class ArrayTest {
    public static void main(String[] args) {
        //  1.一维数组的生命和初始化
        int num;//声明
        num=10;//初始化
        int id=1001;//声明+初始化

        int[] ids;//声明
        // 1.1 静态初始化:数组的初始化和数组元素的赋值操作同时进行
        ids=new int[]{1001,1002,1003,1004};//初始化
        // 1.2动态初始化:数组的初始化和数组元素的赋值操作分开进行
        String[] names=new String[5];
        // 2.如何调用数组的指定位置的元素
        // 数组的角标(或索引)从0开始的,到数组的长度-1结束。
        names[0]="哪吒";
        names[1]="孙悟空";
        names[2]="鲤鱼王";
        names[3]="黑熊精";
        names[4]="九灵元圣";
        //3.如何获取数组的长度
        //属性length;
        System.out.println(names.length);
        System.out.println("============================");
        //4.如何遍历数组
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        System.out.println("============================");
        //5.数组元素的默认初始化值
        int[] arr=new int[5];
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("============================");
        short[] arr1=new short[5];
        for (int i = 0; i <arr1.length ; i++) {
            System.out.println(arr1[i]);
        }
        System.out.println("============================");
        float[] arr2=new float[5];
        for (int i = 0; i <arr2.length ; i++) {
            System.out.println(arr2[i]);
        }
        System.out.println("============================");
        char[] arr3=new char[5];
        for (int i = 0; i < arr3.length; i++) {
            System.out.println("----"+arr3[i]+"******");
        }
        if(arr3[0] == 0){
            System.out.println("如哟");
        }
        System.out.println("============================");
        boolean[] arr4=new boolean[5];
        System.out.println(arr4[0]);
        System.out.println("============================");
        String[] arr5=new String[5];
        System.out.println(arr5[0]);
        if (arr5[0]==null){
            System.out.println("孙悟空没有大闹天宫！");
        }
        System.out.println("===========数组的内存解析=================");
        //6.数组的内存解析

    }
}

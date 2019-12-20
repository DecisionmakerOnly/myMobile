package com.it.java.array;

/**
 * @author ljh
 * @create 2019-12-20
 */
public class ArrayTest2 {
    public static void main(String[] args) {
        //1.二维数组的声明和初始化
        int[] arr=new int[]{1,2,3}; //一维数组
        //静态初始化
        int[][] arr1=new int[][]{{1,2,3},{4,5},{6,7,8}};
        //动态初始化1
        String[][] arr2=new String[3][2];
        //动态初始化2
        String[][] arr3=new String[3][];
        //正确的写法
        int[] arr4[]=new int[][]{{1,2,3},{4,5},{6,7,8}};
        //类型推断
        int[] arr8[]={{1,2,3},{4,5},{6,7,8}};
        //2.如何调用数组的指定位置的元素
        System.out.println(arr1[0][1]);//2
        System.out.println(arr2[1][1]);//null
        arr3[1]=new String[4];
        System.out.println(arr3[1][0]);
        //3.如何获取数组的长度
        System.out.println(arr4.length);//3
        System.out.println(arr4[0].length);//3
        System.out.println(arr4[1].length);//2
        //4.如何遍历数组
        for (int i = 0; i <arr4.length ; i++) {
            for (int j=0;j<arr4[i].length;j++){
                System.out.print(arr4[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("================================");
        //5.数组元素的默认初始化值
        int[][] arr5=new int[4][3];
        System.out.println(arr5[0]);//[I@7f31245a
        System.out.println(arr5[0][0]);//0
        System.out.println("================================");
        float[][] arr6=new float[4][3];
        System.out.println(arr6[0]);//[F@6d6f6e28
        System.out.println(arr6[0][0]);//0.0
        System.out.println("================================");
        String[][] arr7=new String[4][3];
        System.out.println(arr7[0]);//[Ljava.lang.String;@135fbaa4
        System.out.println(arr7[0][0]);//null
        System.out.println("================================");
        double[][] arr9=new double[4][];
        System.out.println(arr9[1]);//null
//        System.out.println(arr9[1][0]);//报错

    }
}

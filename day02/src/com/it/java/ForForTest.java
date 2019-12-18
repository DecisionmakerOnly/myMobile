package com.it.java;

/**
 * @author ljh
 * @create 2019-12-17
 */
public class ForForTest {
    public static void main(String[] args) {
//        嵌套循环的的使用
//            1、嵌套循环：将一个循环结构A声明在另一个循环结构B的循环体中，
//               这样就构成了嵌套循环
//            2、外层循环：循环结构B
//               内层循环：循环结构A
//            3、说明：
//                   ①内层循环体结构遍历一遍，只相当于外层循环体执行了一次。
//                   ②假设外层循环体需要执行m次，内层循环体需要执行n次。
//                    此时内层循环体执行了m*n次
        //        //控制台输出******
        for (int i = 0; i <6 ; i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.println("=======================");
        for(int j = 0; j <4;j++){
            for (int i = 0; i <6 ; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("=======================");
        for (int i = 0; i <5 ; i++) {
            for (int j = 0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("=======================");
        for (int i = 0; i <5 ; i++) {
            for (int j=0;j<5-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("=======================");
        //乘法口诀表输出：
        for (int i = 1; i <= 9; i++) {
            for (int j =1;j<=i;j++){
                System.out.print(i+" * "+j+" = "+i*j);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("=======================");
        //100以内所有质数？质数：素数，只能被1和它本身整除的自然数
//                        从2开始，到这个数-1结束为止，都不能被自身整除
        long start=System.currentTimeMillis();
        int count=0;
        for (int i = 2; i <=100000 ; i++) {
            boolean isflag=true;
            for (int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    isflag=false;
                    break;//优化一：只对本身非质数的自然数是有效的
                }
            }
            if(isflag){
//                System.out.println(i);
                count++;
            }
//            isflag=true;
        }
        System.out.println("质数个数为："+count);
        long end=System.currentTimeMillis();
        System.out.println("耗费时间："+(end-start));
    }
}

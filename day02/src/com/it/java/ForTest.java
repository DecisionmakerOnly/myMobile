package com.it.java;

import java.util.Scanner;

/**
 * @author ljh
 * @create 2019-12-16
 */
public class ForTest {
    public static void main(String[] args) {
//        for (int i=0;i<5;i++){
//            System.out.println("hello word!");
//        }
        //练习
//        int num=1;
//        for (System.out.println("a");num<=3;System.out.println("c"),num++){
//            System.out.println("b");
//        }
        //例题：遍历100以内的偶数,输出所有偶数的和,输出偶数的个数
//        int sum=0;
//        int number=0;
//        for (int i=1;i<=100;i++){
//            if(i % 2==0){
//                sum+=i;
//                number++;
//                System.out.println(i);
//            }
//        }
//        System.out.println(sum);
//        System.out.println(number);
//        编写程序从1循环到150,并在每行打印一个值,
//        另外在每个3的倍数行上打印出"foo",
//        在每个5的倍数行上打印"biz",
//        在每个7的倍数行上打印输出“baz”。
//        for (int i=1;i<=150;i++){
//            System.out.print(i+" ");
//            if(i %3==0){
//                System.out.print("foo ");
//            }
//            if(i%5==0){
//                System.out.print("biz ");
//            }
//            if(i%7==0){
//                System.out.print("baz ");
//            }
//            System.out.println();
//        }
        //题目：输入两个题目:
        //              输入两个正整数m和n,求其最大公约数和最小公倍数。
        //              比如: 12和20的最大公约数是4,最小公倍数是60
        // 说明: break关键字的使用

        Scanner scan=new Scanner(System.in);

        System.out.println("请输入第一个正数");
        int m=scan.nextInt();

        System.out.println("请输入第二个正数");
        int n=scan.nextInt();
        // 获取最大公约数
        //获取两个数中最小的值
        int min=(m<=n)?m : n;
        for(int i= min;i >= 1;i--){
            if(m % i ==0 && n % i ==0){
                System.out.println(i);
                break;//一旦在循环中执行到break；就直接跳出循环
            }
        }
        //获取最大公倍数
        int max=(m>n)? m:n;
        for (int i=max;i<=m*n;i++){
            if(i % m== 0 && i % n == 0){
                System.out.println(i);
                break;//一旦在循环中执行到break；就直接跳出循环
            }
        }
    } 
}
//a-b-c-b-c-b-c

package com.it.java;

import javax.xml.transform.Source;

/**
 * @author ljh
 * @create 2019-12-17
 */
public class DoWhileTest {
    public static void main(String[] args) {
        /**
         * do-while 循环的使用
         *一、循环结构的四要素
         *     ①初始化条件
         *     ②循环条件--是boolean类型的
         *     ③循环体
         *     ④迭代条件
         * 二、do-while循环结构：
         *         ①
         *        do{
         *           ③;
         *           ④;
         *          }while (②);
         *    执行过程： ①-③-④-②-③-④-...-②
         */
        //遍历100以内的偶数，并计算所有偶数的和及偶数的个数
        int num =1;
        int sum =0;//记录总和
        int count=0;//记录个数
        do {
            if(num %2==0){
                System.out.println(num);
                sum+=num;
                count++;
            }
            num++;
        }while (num<=100);
        System.out.println("总和为："+sum);
        System.out.println("个数为："+count);
        System.out.println("=================");
        int number1=10;
        while (number1>10){
            System.out.println("hello:while");
            number1--;
        }

        int number2=10;
        do {
            System.out.println("hello:do-while");
            number2--;
        }while (number2>10);
        int c=10;
        int a=c++;
        int d=0;
        d--;
        System.out.println("a:"+a);
        System.out.println("c:"+c);
        System.out.println("d:"+d);
    }

}

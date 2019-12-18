package com.it.java;

import java.util.Scanner;

/**
 * @author ljh
 * @create 2019-12-17
 */
public class ForWhileTest {
    public static void main(String[] args) {
        /**
         * 题目:从键盘读入个数不确定的整数,并判断读入的正数和负数的个数,输入为0时结束程序。
         */
        Scanner scanner=new Scanner(System.in);
        int positiveNumber=0;//记录正数个数
        int negativeNumber=0;//记录负数个数
        //while (true)
      for(;;) {
            int number=scanner.nextInt();
//            判断正负情况
            if(number>0){
                positiveNumber++;
            }else if (number<0){
                negativeNumber++;
            }else{
                break;
            }
        }
        System.out.println("输入的正数个数为："+positiveNumber);
        System.out.println("输入的负数个数为："+negativeNumber);
    }
}

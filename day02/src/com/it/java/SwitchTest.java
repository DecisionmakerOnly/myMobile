package com.it.java;

import java.util.Scanner;

/**
 * @author ljh
 * @create 2019-12-16
 */
public class SwitchTest {
    public static void main(String[] args) {
//        int number =2;
//        switch(number){
//            case 0:
//                System.out.println("zero");
//                break;
//            case 1:
//                System.out.println("one");
//                break;
//            case 2:
//                System.out.println("two");
//                break;
//            case 3:
//                System.out.println("three");
//                break;
//            default:
//                System.out.println("other");
//        }
//            例题：对学生成绩大于60分的，输出“合格”，低于60分的输出不合格.
           int score=38;
            switch (score /10){
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    System.out.println("不及格");
                    break;
                case 6:
                case 7:
                case 9:
                case 10:
                    System.out.println("及格");
                    break;
            }
            //更优方案
            switch (score /60){
                case 0:
                    System.out.println("不及格！");
                    break;
                case 1:
                    System.out.println("及格！");
            }
        //从键盘上输入2019年的“month”和“day”，要求通过程序输出输入的日期是2019年的第几天
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("请输入2019年的month：");
//        int month=scanner.nextInt();
//        System.out.println("请输入2019年的day");
//        int day=scanner.nextInt();
//        int sumDays=0;
//        switch(month){
////            case 1:
////                sumDays=31+day;
////                System.out.println("时间是："+sumDays);
//            case 12:
//                sumDays+=30;
//            case 11:
//                sumDays+=31;
//            case 10:
//                sumDays+=30;
////                System.out.println("时间是："+sumDays);
//            case 9:
//                sumDays+=31;
//            case 8:
//                sumDays+=31;
//            case 7:
//                sumDays+=30;
//            case 6:
//                sumDays+=31;
//            case 5:
//                sumDays+=30;
//            case 4:
//                sumDays+=31;
//            case 3:
//                sumDays+=28;
//            case 2:
//                sumDays+=31;
//            case 1:
//                sumDays+=day;
//        }
//        System.out.println("2019年"+month+"月"+day+"日是当年的第"+sumDays+"天");
        //从键盘上分别输入年、月、日判断这一天是当年的第几天
//            注：判断一年是否是闰年的标准
//                1)可以被4整除，但不可被100整除
//                或
//                2）可以被400整除
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入year");
        int year=scanner.nextInt();
        System.out.println("请输入month：");
        int month=scanner.nextInt();
        System.out.println("请输入day");
        int day=scanner.nextInt();
        int sumDays=0;
        switch(month){
//            case 1:
//                sumDays=31+day;
//                System.out.println("时间是："+sumDays);
            case 12:
                sumDays+=30;
            case 11:
                sumDays+=31;
            case 10:
                sumDays+=30;
//                System.out.println("时间是："+sumDays);
            case 9:
                sumDays+=31;
            case 8:
                sumDays+=31;
            case 7:
                sumDays+=30;
            case 6:
                sumDays+=31;
            case 5:
                sumDays+=30;
            case 4:
                sumDays+=31;
            case 3:
//                sumDays+=28;
                if((year %4==0 && year%100!=0 )||year % 400==0){
                    sumDays+=29;
                }else{
                    sumDays+=28;
                }
            case 2:
                sumDays+=31;
            case 1:
                sumDays+=day;
        }
        System.out.println(year+"年"+month+"月"+day+"日是当年的第"+sumDays+"天");
    }
}

package com.it.java.array;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * @author ljh
 * @create 2019-12-19
 */
public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr =new int[]{8,2,1,0,3};
        int[] index=new  int[]{2,0,3,2,4,0,1,3,2,3,3};
        String tel="";//i<10
        for (int i = 0; i <index.length ; i++) {
            tel+=arr[index[i]];//180
        }
        System.out.println("联系方式："+tel);
        System.out.println("==============================");
        /**
         * 2.从键盘读入学生成绩,找出最高分,并输出学生成绩等级。
         *      成绩>=最高分-10等级为'A
         *      成绩最高分-20等级为'B'
         *      成绩>=最高分-30等级为C
         *      其余等级为D'
         *   提示:先读入学生人数,根据人数创建int数组,存放学生成绩。
         */
        //1.使用scanner，读取学生个数
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入学生人数：");
        int number=scanner.nextInt();
        //2.创建数组，存储学生成绩，动态初始化
        int[] scores=new int[number];
        //3.给数组元素赋值
        System.out.println("总共有"+number+"个学生。" );
        int maxScores=0;
        for (int i = 0; i <scores.length ; i++) {
            System.out.println("请输入第"+(i+1)+"个学生的成绩：");
            scores[i]=scanner.nextInt();
            if (maxScores<scores[i]) {
                maxScores = scores[i];
            }
        }
        //4.获取数组中的元素最大值 ：最高分
//        int maxScores=0;
//        for (int i = 0; i <scores.length ; i++) {
//            if (maxScores<scores[i]){
//                maxScores =scores[i];
//            }
//        }
        //5.根据每个学生成绩与最高分的差值,得到每个学生的等级,并输出等级和成绩
        char level;
        for (int i = 0; i <scores.length ; i++) {
            if(maxScores -scores[i]<=10){
                level='A';
            }else if (maxScores -scores[i]<=20){
                level='B';
            }else if (maxScores -scores[i]<=30){
                level='C';
            }else{
                level='D';
            }
            System.out.println("");
            System.out.println("student:"+(i+1)+"; score is:"+scores[i]+"; grade is:"+level);
        }
    }
}


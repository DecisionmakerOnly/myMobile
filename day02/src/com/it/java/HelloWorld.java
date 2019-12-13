package com.it.java;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author ljh
 * @create 2019-11-22
 */
public class HelloWorld {
    public static void main(String[] args) {
        int num1=12;
        int num2=5;
        int result1 =num1/num2;
        System.out.println(result1);
        /*************************/
        //前（++）先自增1,后运算
        //后（++）先运算,后自增1
        int a1=10;
        int b1=++a1;
        System.out.println("a1="+a1+",b1="+b1);//a1=11,b1=11

        int a2=10;
        int b2=a2++;
        System.out.println("a2="+a2+",b2="+b2);//a2=11,b2=10

        short s1=10;
        s1=(short)(s1+1);
        System.out.println(s1);
        s1++;//自增1不会改变本身变量的数据类型


        int a4=10;
        int b4=--a4;
        System.out.println("a4="+a4+",b4="+b4);//a4=9;b4=9

        int a5=10;
        int b5=a5--;
        System.out.println("a5="+a5+",b5="+b5);//a5=9;b5=10
        System.out.println("======================================");
        int i1 = 10;
        int i2 = 20;
        int i = i1++;
        System.out.print("i="+i);//i=10 i1=11
        System.out.println("i1="+i1);
        i = ++i1;
        System.out.print("i="+i);//i=12 i1=12
        System.out.println("i1="+i1);
        System.out.println("-------------------------");
        i=i2--;
        System.out.println("i="+i);//i=20
        System.out.println("i2="+i2);//i2=19
        i=--i2;
        System.out.println("i="+i);//i=18
        System.out.println("i2="+i2);//i2=18
        System.out.println("===============================");
        /**
         * 随意给出一个整数,打印显示它的个位数,十位数,百位数的值。
         * 格式p下：数字xxx的情况如下:个位数:十位数:百位数:
         * 例如：数字153的情况如下:个位数:3十位数：5百位数:1
         */
        int num=294;
        int ba=num /100;
        int shi=num%100/10;
        int ge =num %10;
        System.out.println("百位："+ba);
        System.out.println("十位："+shi);
        System.out.println("个位："+ge);
        System.out.println("-------------------------------赋值运算符--------------------------------");
        int q1=10;
        int w1=10;
        int q2,w2;
        //连续赋值
        q2=w2=10;
        System.out.println("-------num11---------");
        int num11=10;
        num11+=2;//mum11=mum11+2;
        System.out.println(num11);//12
        System.out.println("-------num22---------");
        int num22=12;
        num22%=5;//num22=num22%5
        System.out.println(num22);//2
        System.out.println("-------short---------");
        short s11=10;
        //s11=s11+2; //编译不通过
        s11+=2;//不会改变变量本身的数据类型
        System.out.println(s11);
        System.out.println("-------------------------------比较运算符--------------------------------");
        /**
         比较运算符
         == ！= < > <= >= instanceof
         结论：
         1.比较运算符的结果是boolean类型的
         2.区分== 和=
         */
        int e=10;
        int ee=11;
        System.out.println(e==ee); //false
        System.out.println(e=ee);//11

        boolean e1=true;
        boolean e2=false;

        System.out.println(e1==e2);//false
        System.out.println(e1=e2); //false
        /**
             逻辑运算符
                &-逻辑与
                &&-短路与
                |-逻辑或
                ||-短路或
                !-逻辑非
                ^-逻辑异或
            说明：
                1.逻辑运算符操作的都是boolean类型的变量
         */
        System.out.println("-------------------------------逻辑运算符--------------------------------");
        //区分&和&&
        //相同点1：&和&&的运算结果相同
        //相同点2：当符号左边是true时，二者都会执行符号右边的运算
        //不同点：当符号左边时false时，&会继续执行符号右边的运算，&&不在执行符号右边的运算
        boolean r1=true;
        r1=false;
        int num111=10;
        if(r1 &(num111++ >0)){
            System.out.println("我现在在北京");
        }else{
            System.out.println("我现在在南京");
        }
        System.out.println("num111："+num111);
        boolean r2=true;
        r2=false;
        int num112=10;
        if(r2 &&(num112++ >0)){
            System.out.println("我现在在北京");
        }else{
            System.out.println("我现在在南京");
        }
        System.out.println("num112："+num112);
        /**********************************| 与 ||******************************************/
        // 区分|和||
        //相同点1：|和||的运算结果相同
        //相同点2：当符号左边是false时，二者都会执行符号右边的运算
        //相同点3：当符号左边是true时，|继续执行符号右边的运算，而||不在执行符号右边的运算
        boolean t1=true;
        t1=false;
        int num1111=10;
        if(t1 |( num1111++ >0)){
            System.out.println("我现在在北京");
        }else{
            System.out.println("我现在在南京");
        }
        System.out.println("num1111："+num1111);
        boolean t2=true;
        t2=false;
        int num1122=10;
        if(t2 ||(num1122++ >0)){
            System.out.println("我现在在北京");
        }else{
            System.out.println("我现在在南京");
        }
        System.out.println("num1122："+num1122);
    }
}

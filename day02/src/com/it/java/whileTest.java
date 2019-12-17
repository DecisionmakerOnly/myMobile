package com.it.java;

/**
 *  while
 */
public class whileTest {
    public static void main(String[] args) {
        /**
         *  while 循环的使用：
         *  一、循环结构的四要素
         *  ①初始化条件
         *  ②循环条件--是boolean类型的
         *  ③循环体
         *  ④迭代条件
         *  二、while循环结构
         *  ①
         *  while(②){
         *      ③;
         *      ④;
         *  }
         *  执行过程： ①-②-③-④-②-③-④-....-②
         * 说明：1、写while循环一定不能少了④，一旦丢了就可能出现死循环
         * ​	2、我们写程序，要避免出现死循环
         *      3、for循环和while循环是可以相互转换的！
         * ​	  区别：for 循环和while循环的初始化条件的作用范围不同。
         */
//        遍历100以内的所有偶数
        int i=1;
        while (i<=100){
            if(i %2==0){
                System.out.println(i);
            }
            i++;
        }
    }
}

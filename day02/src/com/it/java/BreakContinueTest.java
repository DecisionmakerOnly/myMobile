package com.it.java;

/**
 * @author ljh
 * @create 2019-12-18
 */
public class BreakContinueTest {
    public static void main(String[] args) {
        for (int i = 1; i <=10 ; i++) {
            if(i % 4 == 0){
                // break; //123
                continue;
            }
            System.out.print(i);
        }
        System.out.print("\n");
        System.out.print("=====================");
        System.out.print("\n");
        label:for (int i = 1; i <=4 ; i++) {
            for (int j=1;j<=10;j++){
                if(j % 4 ==0){
                  //  break;//默认跳过包裹此关键字的最近的一层循环
                    //continue;
                   // break label;//结束指定标识的一层循环结构
                    continue label;//结束指定标识的一层循环结构的当次循环
                }
                System.out.print(j);
            }
        }
        System.out.print("\n");
        System.out.print("=====================");
        System.out.print("\n");
        //100以内所有质数？质数：素数，只能被1和它本身整除的自然数
        //从2开始，到这个数-1结束为止，都不能被自身整除
        long start=System.currentTimeMillis();
        int count=0;
        label:for (int i = 2; i <=100000 ; i++) {
            for (int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    continue label;
                }
            }
            count++;
        }
        System.out.println("质数个数为："+count);
        long end=System.currentTimeMillis();
        System.out.println("耗费时间："+(end-start));
        System.out.print("\n");
        System.out.print("=====================");
        System.out.print("\n");
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {// [0,1) [0,30) [1,31)
            arr[i] = (int) (Math.random() * 30) + 1;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    i--;
                    break;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.print("\n");
        System.out.print("=====================");
        System.out.print("\n");

    }
}

package com.it.exer;

/**
 * 练习：创建两个分线程，其中一个遍历100以内的偶数，另一个遍历100以内的奇数
 * @author ljh
 * @create 2019-11-21
 */
public class ThreadDemo {
    public static void main(String[] args) {
//        MyThread1 m1=new MyThread1();
//        MyThread2 m2=new MyThread2();
//
//        m1.start();
//        m2.start();
//        创建Thread类的匿名子类的方式
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i <100 ; i++) {
                    if(i % 2==0){
                        System.out.println(Thread.currentThread().getName()+":"+ i);
                    }
                    if(i % 2!=0){
                        System.out.println(Thread.currentThread().getName()+":"+ i);
                    }
                    System.out.println("测试提价");
                }
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i <100 ; i++) {
                    if(i % 2!=0){
                        System.out.println(Thread.currentThread().getName()+":"+ i);
                    }
                }
            }
        }.start();
    }
}
class MyThread1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            if(i % 2==0){
                System.out.println(Thread.currentThread().getName()+":"+ i);
                System.out.println(Thread.currentThread().getName()+":"+i+"sdghcbjg");
            }
        }
    }
}
class MyThread2 extends Thread{
    @Override
    public void run (){
        for (int i = 0; i < 100; i++) {
            if(i % 2 !=0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}
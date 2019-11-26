package com.it.java;

/**
 *
 *  测试Thread中的常用方法
 *      1.start()：启动当前线程，调用当前线程的run();
 *      2.run():通常需要重写Thread类的此方法，将创建的线程执行的操作声明在此方法中
 *      3.currentThread():静态方法，返回执行当前代码的线程
 *      4.getName():获取当前线程名字
 *      5.setName():设置当前线程名字
 *      6.yield():线程让步 暂停当前正在执行的线程，把执行机会让给优先级相同或更高的线程 若队列中没有同优先级的线程，忽略此方法
 *      7.join() ：当某个程序执行流中调用其他线程的 join() 方法时，调用线程将 被阻塞，直到 join() 方法加入的 join 线程执行完为止
 *                 低优先级的线程也可以获得执行
 *      8.static  void  sleep(long millis)：(指定时间:毫秒)
 *                  令当前活动线程在指定时间段内放弃对CPU控制,使其他线程有机会被执行,时间到后 重排队。
 *                  抛出InterruptedException异常
 *      9stop(): 强制线程生命期结束，不推荐使用
 *      10.boolean isAlive()：返回boolean，判断线程是否还活着
 *       线程的优先级等级
 *          MAX_PRIORITY：10
 *          MIN _PRIORITY：1
 *          NORM_PRIORITY：5
 *        涉及的方法 getPriority() ：返回线程优先值
 *                  setPriority(int newPriority) ：改变线程的优先级
 *        说明 线程创建时继承父线程的优先级
 *             低优先级只是获得调度的概率低，并非一定是在高优先级线程之后才被调用
 * @author ljh
 * @create 2019-11-21
 */

class HelloThread extends Thread{
    @Override
    public void run(){
        for (int i = 0; i <100 ; i++) {
            if(i % 2 ==0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }

}

public class ThreadMethodTest {
    public static void main(String[] args) {
        HelloThread ht=new HelloThread();
        ht.setName("线程1");
        ht.start();
//      给主线程修改名字
        Thread.currentThread().setName("主线程");
        for (int i = 0; i <100 ; i++) {
            if(i % 2 ==0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }

        }
    }
}

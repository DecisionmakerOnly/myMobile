package com.it.java;

/**
 * 例子：创建三个窗口买票，总票数为100张
 * @author ljh
 * @create 2019-11-21
 */
class window extends Thread{
    private static int ticket=100;
    @Override
    public void run() {
        while (true){
            if(ticket >0){
                System.out.println(getName()+":买票，票号为："+ticket);
                ticket --;
            }else{
                break;
            }
        }
    }
}
public class windowTest {
    public static void main(String[] args) {
        window t1=new window();
        window t2=new window();
        window t3=new window();

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");
        t1.start();
        t2.start();
        t3.start();
    }
}

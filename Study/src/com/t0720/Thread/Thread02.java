package com.t0720.Thread;

public class Thread02 implements Runnable{
    int num = 100;
    Object obj = new Object();
    @Override
    public void run() {
        synchronized (obj){
            while (true){
                if (num >= 1){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    Thread t = Thread.currentThread();
                    System.out.println(t.getName()+"  ========  "+num);
                    num--;

                }
            }
        }
    }
}

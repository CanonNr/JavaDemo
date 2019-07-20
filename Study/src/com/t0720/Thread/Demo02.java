package com.t0720.Thread;

public class Demo02 {
    public static void main(String[] args) {
        Thread02 thread02 = new Thread02();

        Thread t = new Thread(thread02);
        t.start();

        Thread t1 = new Thread(thread02);
        t1.start();
    }
}

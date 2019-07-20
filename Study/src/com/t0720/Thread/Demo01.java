package com.t0720.Thread;

public class Demo01 {
    public static void main(String[] args) {
        for (int i = 0; i < 15; i++) {
            method();
        }
    }

    public static void method() {
        Thread thread1 = new Thread01();
        thread1.start();
    }
}

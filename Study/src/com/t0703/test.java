package com.t0703;

import java.util.Random;

public class test {
    public static void main(String[] args) {
        Random random = new Random();


        for (int i = 0; i < 10; i++) {
            int a = random.nextInt(10);
            System.out.println(a);
        }
    }
}

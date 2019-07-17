package com.t0717;


import java.util.ArrayList;

public class foreachDemo {
    public static void main(String[] args) {
        ArrayList<String> c = new ArrayList<String>();

        for (int i = 1; i <= 10; i++) {
            c.add("Student"+i);
        }

        System.out.println(c);


        for (String s:c) {
            System.out.println(s.toUpperCase() );
        }
    }
}

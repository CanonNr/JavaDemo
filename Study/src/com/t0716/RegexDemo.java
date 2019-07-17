package com.t0716;

public class RegexDemo {

    public static void main(String[] args) {
        String s = "15000";
        boolean flag =  s.matches("[0-9]{1,6 }");
        System.out.println(flag);
    }
}

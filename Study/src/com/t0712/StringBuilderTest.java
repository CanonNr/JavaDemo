package com.t0712;

public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        s.append("北京");
        s.append("上海");
        s.append("广州");
        System.out.println(s);
        System.out.println(s.toString());
        System.out.println("===================");
        System.out.println(s.reverse());
    }
}

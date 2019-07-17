package com.t0715;

public class Inner001 {
    public static void main(String[] args) {
        new Haha(){
            @Override
            public void say() {
                System.out.println(12388);
            }
        }.say();
    }
}


interface Haha{
    public void say();
}

package com.t0714;

public class AbstractTest001 {
    public static void main(String[] args) {
        Bc bc = new Bc("大奔");
        bc.action();

        Bmw bmw = new Bmw("别摸我");
        bmw.action();
    }
}

abstract class Car {
    String name;
    int s;

    public abstract void action();
}

class Bmw extends Car {
    public Bmw(String name) {
        this.name = name;
    }

    @Override
    public void action() {
        System.out.println(this.name + "=====欻欻跑起来");
    }
}

class Bc extends Car {

    public Bc(String name) {
        this.name = name;
    }

    @Override
    public void action() {
        System.out.println(this.name + "=====呼呼跑起来");
    }
}

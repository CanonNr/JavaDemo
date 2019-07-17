package com.t0715;

public class InterfaceTest001 {

    public static void main(String[] args) {
        mi mi = new mi();
        mi.battery();
    }
}

interface Phone{
    public abstract void camera();

    public abstract void cpu();

    public abstract void battery();
}


class mi implements Phone{
    @Override
    public void camera() {
        System.out.println("48MP");
    }

    @Override
    public void cpu() {
        System.out.println("855");
    }

    @Override
    public void battery() {
        System.out.println(3000);
    }
}

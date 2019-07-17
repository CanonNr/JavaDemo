package com.t0713;
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("北京");
        al.add("上海");
        al.add("天津");
        al.add("南京");
        al.add("济南");
        al.add(1,"广州");
        //获取指定
        System.out.println(al.get(1));
        //长度
        System.out.println(al.size());
        //根据值删除  返回boolean
        System.out.println(al.remove("广州"));
        //根据键删除
        System.out.println(al.remove(1));
        //修改

        System.out.println(al);
        System.out.println(al.set(1,"深圳"));
        System.out.println(al);

        /**
         * 遍历
         */
        for (int i = 0; i < al.size(); i++) {
            System.out.println("第"+(i+1)+"个城市是:"+al.get(i));
        }
    }
}

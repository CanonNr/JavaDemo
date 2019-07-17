package com.t0717;

import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {

        //demoA();

        //System.out.println("===========================================");

        //demoB();

        //System.out.println("===========================================");

        //demoC();

        //System.out.println("===========================================");

        //demoD1();  // 错误

        //System.out.println("===========================================");

        List c = new ArrayList();

        for (int i = 1; i <= 5; i++) {
            System.out.print(c.add("Student"+i)+"   ");
        }

        System.out.println("   ");

        ListIterator l = c.listIterator();
        while(l.hasNext()){
            String s = (String)l.next();
            System.out.print(s+"  ");
            if (s.equals("Student5")){
                l.add("Student6");
            }
        }

        System.out.println(c);

    }

    public static void demoD1() {
        Collection<String> c = new ArrayList<String>();

        for (int i = 1; i <= 10; i++) {
            System.out.print(c.add("Student"+i)+"  ");
        }

        System.out.println(" ");

        Iterator i = c.iterator();

        while (i.hasNext()){
            String s = (String)i.next();
            System.out.println(s);
            if (s.equals("Student10")){
                //c.add("Student11");
                //Exception in thread "main" java.util.ConcurrentModificationException
                //	at java.util.ArrayList$Itr.checkForComodification(ArrayList.java:909)
                //	at java.util.ArrayList$Itr.next(ArrayList.java:859)
                //	at com.t0717.CollectionDemo.main(CollectionDemo.java:33)
            }
        }
    }

    public static void demoC() {
        Collection c = new  ArrayList();

        for (int i = 1; i <= 10; i++) {
            System.out.print(c.add("Student"+i)+"        ");
        }

        System.out.println("#####");
        System.out.println("#####");
        System.out.println("#####");

        Iterator i = c.iterator();

//        for (int j = 0; j < c.size(); j++) {
//            System.out.print(i.next()+"        ");
//            //System.out.println(i.hasNext());
//        }

        System.out.println("#####");
        System.out.println("#####");
        System.out.println("#####");

        while (i.hasNext()){
            System.out.print(i.next()+"        ");
        }
    }

    public static void demoA() {
        Collection c = new ArrayList();
        System.out.println(c.add("hello"));     //true  添加成功
        System.out.println(c.add("sun"));       //true  添加成功
        System.out.println(c.contains("sun"));  //true  存在"sun"
        System.out.println(c.contains("abc"));  //false 不存在
        System.out.println(c.size());           //2     长度
        System.out.println(c.isEmpty());        //false 是否为空
        c.clear();                              //无返回 清空集合
        System.out.println(c.isEmpty());        //true  是否为空
    }

    public static void demoB() {
        Collection c = new ArrayList();

        for (int i = 1; i <= 10; i++) {
            System.out.println(c.add("Student"+i));
        }

        System.out.println(c);

        Object[] arr = c.toArray();
        System.out.println(arr);

        //有索引
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

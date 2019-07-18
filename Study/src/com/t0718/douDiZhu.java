package com.t0718;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;

public class douDiZhu {
    public static void main(String[] args) {
        String[] array1 = {"红桃","方片","黑桃","梅花"};
        String[] array2 = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String[] array3 = {"大王","小王"};
        HashSet<String> h = new HashSet<String>();
        ArrayList<String> dizhu = new ArrayList<String>();
        ArrayList<String> play1 = new ArrayList<String>();
        ArrayList<String> play2 = new ArrayList<String>();
        ArrayList<String> play3 = new ArrayList<String>();
        //组牌
        for (String string1:array1) {
            for (String string2:array2) {
                h.add(string1+string2);
            }
        }

        for (String string:array3) {
            h.add(string);
        }

        //洗牌
        Object[] a = h.toArray();

        for (int i = 0; i < a.length; i++) {
            if(i>=a.length-3){
                dizhu.add((String)a[i]);
            }
            switch (i%3){
                case 0:
                    play1.add((String)a[i]);
                    break;
                case 1:
                    play2.add((String)a[i]);
                    break;
                case 2:
                    play3.add((String)a[i]);
                    break;
            }
        }
        /**
         * [黑桃2, 黑桃5, 黑桃8, 黑桃10, 红桃7, 红桃4, 黑桃J, 红桃9, 方片9, 方片6, 方片3, 方片K, 小王, 红桃A, 红桃K, 梅花4, 梅花7, 红桃Q]
         * [黑桃3, 黑桃6, 梅花10, 黑桃A, 红桃6, 红桃3, 黑桃K, 黑桃Q, 方片8, 方片5, 方片2, 红桃10, 方片A, 梅花K, 梅花A, 梅花5, 梅花8, 梅花2]
         * [黑桃4, 黑桃7, 黑桃9, 红桃8, 红桃5, 红桃2, 梅花Q, 方片10, 方片7, 方片4, 大王, 方片J, 梅花J, 方片Q, 红桃J, 梅花6, 梅花9, 梅花3]
         * [红桃Q, 梅花2, 梅花3]
         */
    }

}

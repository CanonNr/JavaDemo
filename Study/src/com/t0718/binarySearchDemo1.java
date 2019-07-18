package com.t0718;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class binarySearchDemo1 {

    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(1);
        int index = Collections.binarySearch(a,1);
        System.out.println(index);

        ArrayList b = new ArrayList();
        Collections.copy(b,a);

        System.out.println(b);
    }
}

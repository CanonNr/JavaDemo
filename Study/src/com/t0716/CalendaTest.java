package com.t0716;

import java.util.Calendar;

public class CalendaTest {

    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.add(Calendar.YEAR,15);
        c.set(Calendar.MONTH,3);
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.HOUR_OF_DAY));
        System.out.println(c.get(Calendar.MINUTE));

    }
}

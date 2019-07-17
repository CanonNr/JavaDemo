package com.t0716;

import javax.xml.crypto.Data;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ObjectTest {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat s = new SimpleDateFormat("YYYY年M月dd日 HH:mm:ss");
        System.out.println(s.format(date));
    }

    public static void getDate() {
        //        System.out.println(System.currentTimeMillis());
        Date date = new Date();
//        System.out.println(date.getTime());
//        System.out.println(date.toString());
//        System.out.println(date.toLocaleString());

        SimpleDateFormat sdf = new SimpleDateFormat();
        String s = sdf.format(date);
        System.out.println(date.toLocaleString());
        System.out.println(s);
    }
}

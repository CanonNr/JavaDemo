package com.t0718;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class mapDemo1 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();

        for (int i = 1; i <= 5; i++) {
            map.put("00"+i,"Student"+i);
        }

        Set<String> set = map.keySet();

        for (String key:set) {
            System.out.println(map.get(key));
        }

        System.out.println("=======================");

        Set<Map.Entry<String,String>> entrys = map.entrySet();


        for (Map.Entry entry:entrys) {
            String key = (String)entry.getKey();
            String value = (String)entry.getValue();
        }
    }
}

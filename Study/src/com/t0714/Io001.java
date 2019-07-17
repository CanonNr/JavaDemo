package com.t0714;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Io001 {
    public static void main(String[] args) throws IOException {
//        FileWriter fw = new FileWriter("./data.txt");
//        fw.append("23123");
//        fw.flush();
        FileReader fr = new FileReader("./data.txt");
//        System.out.println(fr.read());
        int ch;
        while((ch = fr.read()) != -1){
            System.out.println((char)ch);
        }

    }
}

package com.t0714;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Io002 {
    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new FileWriter("./data.txt"));
    }
}

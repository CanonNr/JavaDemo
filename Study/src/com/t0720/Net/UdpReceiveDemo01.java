package com.t0720.Net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UdpReceiveDemo01 {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds  = new DatagramSocket(15800);

        byte[] bytes = new byte[64];
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length);
        ds.receive(dp);
        byte[] data = dp.getData();

        System.out.println(new String(data));
        ds.close();
    }
}

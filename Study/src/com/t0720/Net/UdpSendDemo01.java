package com.t0720.Net;

import java.io.IOException;
import java.net.*;

public class UdpSendDemo01 {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();
        String s = "lksun.cn";
        byte[] bytes = s.getBytes();
        int length = bytes.length;
        InetAddress address = InetAddress.getLocalHost();
        int port = 15800;
        DatagramPacket dp = new DatagramPacket(bytes,length,address,port);
        ds.send(dp);
        ds.close();
    }
}

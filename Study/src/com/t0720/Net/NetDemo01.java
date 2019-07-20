package com.t0720.Net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetDemo01 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getLocalHost();
        System.out.println(address);

        System.out.println(address.getHostName());
    }
}

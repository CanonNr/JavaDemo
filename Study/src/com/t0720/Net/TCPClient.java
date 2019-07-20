package com.t0720.Net;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket(InetAddress.getLocalHost(),15888);

        OutputStream os = s.getOutputStream();

        String str = "Helle lkusn.cn";
        byte[] bytes = str.getBytes();
        os.write(bytes);
        os.close();
    }
}

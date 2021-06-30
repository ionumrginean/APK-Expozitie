package com.example.masini2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.ByteBuffer;

public class Server_comm {

    protected InputStream inp;
    protected Socket client;

    public void conectare_Server() throws IOException {
        client = new Socket();
        SocketAddress adr = new InetSocketAddress("172.20.240.1", 9999);
        client.connect(adr);
    }

    public void transmitere_Server(ByteBuffer request) throws IOException {
        OutputStream out = client.getOutputStream();
        out.write(request.array());
        out.flush();
    }

    public void deconectare_Server() throws IOException {
        inp.close();
        client.close();
    }
}

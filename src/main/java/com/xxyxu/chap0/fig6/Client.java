package com.xxyxu.chap0.fig6;

public class Client {
    Server server;

    void work() {
        server.open();
        server.print("Hello");
        server.close();
    }
}

package com.xxyxu.chap0.fig6;

public class Server {
    Device device;

    public void open() {
    }

    public void print(String s) {
        device.write(s);
    }

    void close() {
    }
}

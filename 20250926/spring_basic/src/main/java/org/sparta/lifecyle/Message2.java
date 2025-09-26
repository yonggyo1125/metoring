package org.sparta.lifecyle;

public class Message2 {

    public void init() {
        System.out.println("init()");
    }

    public void close() {
        System.out.println("close()");
    }

    public void hello(String name) {
        System.out.printf("%s님 안녕하세요.%n", name);
    }
}

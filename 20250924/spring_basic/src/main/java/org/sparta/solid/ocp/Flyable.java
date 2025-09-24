package org.sparta.solid.ocp;

import org.springframework.stereotype.Component;

@Component
public class Flyable {
    public void fly() {
        System.out.println("오리 날다...");
    }
}

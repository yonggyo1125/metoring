package org.sparta.solid.ocp;

import org.springframework.stereotype.Component;

@Component
public class Quackable {
    public void quack() {
        System.out.println("오래 꽥꽥!");
    };
}

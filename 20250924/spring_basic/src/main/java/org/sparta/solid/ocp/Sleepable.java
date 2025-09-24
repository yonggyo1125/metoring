package org.sparta.solid.ocp;

import org.springframework.stereotype.Component;

@Component
public class Sleepable {
    public void sleep() {
        System.out.println("오리 쿨쿨...");
    }
}

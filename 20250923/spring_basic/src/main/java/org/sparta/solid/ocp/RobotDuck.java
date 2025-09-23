package org.sparta.solid.ocp;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RobotDuck {

    private final Flyable flyable;

    private final Quackable quackable;


    public void func() {
        flyable.fly();
        quackable.quack();
    }
}

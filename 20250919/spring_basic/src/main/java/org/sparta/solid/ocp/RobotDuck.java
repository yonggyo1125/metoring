package org.sparta.solid.ocp;

public class RobotDuck {
    private final Flyable flyable;
    private final Quackable quackable;

    public RobotDuck(Flyable flyable, Quackable quackable) {
        this.flyable = flyable;
        this.quackable = quackable;
    }

    public void func() {
        flyable.fly();
        quackable.quack();
    }
}

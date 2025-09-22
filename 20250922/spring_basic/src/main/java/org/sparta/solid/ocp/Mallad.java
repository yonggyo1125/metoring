package org.sparta.solid.ocp;

public class Mallad {

    private Quackable quackable; // 의존성
    private Sleepable sleepable; // 의존성

    public void setQuackable(Quackable quackable) {
        this.quackable = quackable;
    }

    public void setSleepable(Sleepable sleepable) {
        this.sleepable = sleepable;
    }

    public void func() { // 기능이 정상적으로 동작하라면 quickable, sleepable의 기능이 필요!! 의존성
        quackable.quack();
        // 영향에 대한 대안적인 조치 코드 ....

        sleepable.sleep();
    }
}

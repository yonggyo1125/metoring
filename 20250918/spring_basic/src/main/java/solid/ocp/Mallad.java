package solid.ocp;

public class Mallad {

    private Quackable quackable = new UpgradedQucakable(); // 의존성
    private Sleepable sleepable = new Sleepable(); // 의존성

    public void func() { // 기능이 정상적으로 동작하라면 quickable, sleepable의 기능이 필요!! 의존성
        quackable.quack();
        sleepable.sleep();
    }
}

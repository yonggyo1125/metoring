package solid.ocp;

public class RubberDuck extends Duck {
    // 못날라가고.. 못자는데...
    private Quackable quackable = new UpgradedQucakable();

    public void func() {
        quackable.quack();
    }
}

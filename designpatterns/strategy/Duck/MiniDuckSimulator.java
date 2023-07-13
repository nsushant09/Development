package designpatterns.strategy.Duck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck duck = new RubberDuck();
        duck.performFly();
        duck.setFlyBehaviour(new FlyRocketPowered());
        duck.performFly();
        duck.performQuack();
    }
}

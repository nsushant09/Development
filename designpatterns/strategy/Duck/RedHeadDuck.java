package designpatterns.strategy.Duck;

public class RedHeadDuck extends Duck {
    RedHeadDuck() {
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
    }

    @Override
    void display() {
        System.out.println("Displaying Redhead designpatterns.strategy.Duck");
    }
}

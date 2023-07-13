package designpatterns.strategy.Duck;

public class RubberDuck extends Duck{
    RubberDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Squeak();
    }

    @Override
    void display() {
        System.out.println("Displaying Rubber designpatterns.strategy.Duck");
    }
}

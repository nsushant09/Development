package designpatterns.strategy.Duck;

public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    abstract void display();

    void swim() {
        System.out.println("I'm swimming");
    }

    void performQuack() {
        quackBehaviour.quack();
    }

    void performFly() {
        flyBehaviour.fly();
    }

    void setFlyBehaviour(FlyBehaviour fb) {
        flyBehaviour = fb;
    }

    void setQuackBehaviour(QuackBehaviour qb) {
        quackBehaviour = qb;
    }

}

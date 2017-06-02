package cn.edu.whu;

/**
 * Duck抽象类
 * Created by wuwenan on 30/05/2017.
 */
public abstract class Duck {

    FlyBehavior flyBehavior;

    QuackBehavior quackbehavior;

    public Duck() {
    }

    public void swim() {
        System.out.println("All ducks can swim.");
    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackbehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior fb) {
        this.flyBehavior = fb;
    }

    public void setQuackbehavior(QuackBehavior qb) {
        this.quackbehavior = qb;
    }
}

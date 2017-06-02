package cn.edu.whu;

/**
 * MallardDuck类
 * Created by wuwenan on 31/05/2017.
 */
public class MallardDuck extends Duck {

    @Override
    public void display() {
        System.out.println("I am a real Mallard Duck!");
    }

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackbehavior = new Quack();
    }


}

package cn.edu.whu;

/**
 * ModelDuck类，继承自Duck抽象类
 * Created by wuwenan on 31/05/2017.
 */
public class ModelDuck extends Duck {

    @Override
    public void display() {
        System.out.println("I am a model duck!");
    }

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackbehavior = new Quack();
    }
}

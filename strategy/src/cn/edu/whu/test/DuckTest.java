package cn.edu.whu.test;

import cn.edu.whu.Duck;
import cn.edu.whu.FlyRocketPowered;
import cn.edu.whu.ModelDuck;
import cn.edu.whu.Squeak;

/**
 * Duck测试类
 * Created by wuwenan on 31/05/2017.
 */
public class DuckTest {
    public static void main(String[] args) {
        Duck duck = new ModelDuck();
        duck.display();
        System.out.println("-----鸭子开始行动-----");
        duck.performFly();
        duck.performQuack();
        System.out.println("-----运行时改变鸭子的行为-----");
        duck.setFlyBehavior(new FlyRocketPowered());
        duck.performFly();
        duck.setQuackbehavior(new Squeak());
        duck.performQuack();
    }
}

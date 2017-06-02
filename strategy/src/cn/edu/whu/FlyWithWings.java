package cn.edu.whu;

/**
 * FlyWithWings类，继承自FlyBehavior接口
 * Created by wuwenan on 31/05/2017.
 */
public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm flying!");
    }
}

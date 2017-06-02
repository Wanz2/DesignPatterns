package cn.edu.whu;

/**
 * FlyNoWay类，继承自FlyBehavior接口
 * Created by wuwenan on 31/05/2017.
 */
public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I can't Fly! ");
    }
}

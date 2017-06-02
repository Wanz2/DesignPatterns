package cn.edu.whu;

/**
 * Squeak类，继承自QuackBehavior接口
 * Created by wuwenan on 31/05/2017.
 */
public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}

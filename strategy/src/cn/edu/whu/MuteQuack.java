package cn.edu.whu;

/**
 * MuteQuack类，继承自QuackBehavior接口
 * Created by wuwenan on 31/05/2017.
 */
public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}

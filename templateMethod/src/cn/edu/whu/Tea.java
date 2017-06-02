package cn.edu.whu;

/**
 * Tea类，继承自抽象类CaffeineBeverage
 * Created by wuwenan on 31/05/2017.
 */
public class Tea extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("brewing the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding tea condiments");
    }
}

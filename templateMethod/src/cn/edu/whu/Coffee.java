package cn.edu.whu;

/**
 * Coffee类，继承自抽象类CaffeineBeverage
 * Created by wuwenan on 31/05/2017.
 */
public class Coffee extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("Brewing the coffee");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding coffee condiments");
    }
}

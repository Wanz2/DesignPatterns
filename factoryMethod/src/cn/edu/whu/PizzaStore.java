package cn.edu.whu;

/**
 * 抽象客户端父类
 * Created by wuwenan on 10/06/2017.
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    //工厂方法，让子类实现
    abstract Pizza createPizza(String type);

}

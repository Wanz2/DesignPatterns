package cn.edu.whu;

/**
 * 客户端类
 * Created by wuwenan on 02/06/2017.
 */
public class PizzaStore {
//    SimplePizzaFactory factory;

//    public PizzaStore(SimplePizzaFactory factory) {
//        this.factory = factory;
//    }

    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = SimplePizzaFactory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}

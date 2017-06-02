package cn.edu.whu;

/**
 * 简单工厂类
 * Created by wuwenan on 02/06/2017.
 */
public class SimplePizzaFactory {
    public static Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        }
        return pizza;
    }
}

package cn.edu.whu;

/**
 * 具体产品类
 * Created by wuwenan on 02/06/2017.
 */
public class VeggiePizza extends Pizza {
    public VeggiePizza() {
        name = "Veggie Pizza";
        dough = "Veggie Pizza dough";
        sauce = "Veggie Pizza sauce";

        toppings.add("Veggie Pizza topping1");
        toppings.add("Veggie Pizza topping2");
    }
}

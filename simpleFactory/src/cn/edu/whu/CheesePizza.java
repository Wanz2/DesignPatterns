package cn.edu.whu;

/**
 * 具体产品类
 * Created by wuwenan on 02/06/2017.
 */
public class CheesePizza extends Pizza{
    public CheesePizza() {
        name = "Cheese Pizza";
        dough = "Cheese Pizza dough";
        sauce = "Cheese Pizza sauce";

        toppings.add("Cheese Pizza topping1");
        toppings.add("Cheese Pizza topping2");
    }
}

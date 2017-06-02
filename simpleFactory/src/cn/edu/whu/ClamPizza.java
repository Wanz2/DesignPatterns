package cn.edu.whu;

/**
 * 具体产品类
 * Created by wuwenan on 02/06/2017.
 */
public class ClamPizza extends Pizza {
    public ClamPizza() {
        name = "Clam Pizza";
        dough = "Clam Pizza dough";
        sauce = "Clam Pizza sauce";

        toppings.add("Clam Pizza topping1");
        toppings.add("Clam Pizza topping2");
    }
}

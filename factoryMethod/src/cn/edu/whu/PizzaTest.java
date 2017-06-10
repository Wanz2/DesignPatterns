package cn.edu.whu;

/**
 * 测试类
 * Created by wuwenan on 10/06/2017.
 */
public class PizzaTest {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYStylePizzaStore();
        String pizzaType = "cheese";
        System.out.println("要创建的比萨类型是：" + pizzaType);
        nyPizzaStore.orderPizza(pizzaType);
    }
}

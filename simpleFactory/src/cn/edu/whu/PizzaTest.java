package cn.edu.whu;

/**
 * 测试类
 * Created by wuwenan on 02/06/2017.
 */
public class PizzaTest {
    public static void main(String[] args) {
        SimplePizzaFactory simpleFactory = new SimplePizzaFactory();
//        PizzaStore pizzaStore = new PizzaStore(simpleFactory);
        PizzaStore pizzaStore = new PizzaStore();
        String pizzaType = "cheese";
        System.out.println("要创建的pizza类型是：" + pizzaType);
        pizzaStore.orderPizza(pizzaType);
    }
}

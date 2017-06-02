package cn.edu.whu;

/**
 * 测试类
 * Created by wuwenan on 31/05/2017.
 */
public class BeverageTest {
    public static void main(String[] args) {
        CoffeeWithHook coffeeHook = new CoffeeWithHook();
        System.out.println("开始制作咖啡...");
        coffeeHook.prepareRecipe();
    }
}

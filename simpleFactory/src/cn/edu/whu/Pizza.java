package cn.edu.whu;

import java.util.ArrayList;

/**
 * 抽象产品类
 * Created by wuwenan on 02/06/2017.
 */
public abstract class Pizza {
    String name; //比萨名
    String dough; //使用的面团
    String sauce; //使用的酱料
    ArrayList toppings = new ArrayList(); //使用的佐料

    void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");
        for (int i=0;i<toppings.size();i++) {
            System.out.println("  " + toppings.get(i));
        }
    }

    void bake() {
        System.out.println("Baking...");
    }

    void cut() {
        System.out.println("Cutting the pizza...");
    }

    void box() {
        System.out.println("Placing the pizza in box...");
    }

    public String getName() {
        return name;
    }
}

package cn.edu.whu;

/**
 * 抽象类CaffeineBeverage
 * Created by wuwenan on 31/05/2017.
 */
public abstract class CaffeineBeverage {

    //模板方法，定义了算法步骤
    //使用final声明，防止子类覆盖该方法
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater(){
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }
}

package cn.edu.whu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 继承自CaffineBeverageWithHook
 * Created by wuwenan on 31/05/2017.
 */
public class CoffeeWithHook extends CaffeineBeverageWithHook {

    @Override
    void brew() {
        System.out.println("Brewing the coffee");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding coffee condiments");
    }

    //重写父类中的hook方法
    public boolean customerWantsCondiments() {
        String answer = getUserInput();

        if (answer.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

    //接收用户输入并返回
    private String getUserInput(){
        String answer = null;

        System.out.println("咖啡要加调料吗？(y/n)");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (answer == null) {
            return "no";
        }
        return answer;
    }
}

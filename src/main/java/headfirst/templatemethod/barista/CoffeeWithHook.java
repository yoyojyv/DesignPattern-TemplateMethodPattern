package headfirst.templatemethod.barista;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by yoyojyv on 2014. 3. 3..
 */
public class CoffeeWithHook extends CaffeineBeverageWithHook {

    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

    /**
     * 후크를 오버라이드해서 원하는 기능을 집어넣음
     * @return
     */
    @Override
    boolean customerWantsCondiments() {
        // 첨가물을 넣을지 말지를 손님한테 물어보고, 손님이 입력한 내용에 따라 true 혹은 false 리턴
        String answer = getUserInput();
        if (answer.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 손님에게 우유와 설탕을 넣을지를 무어보고, 명령행을 통해서 결과를 입력받음
     *
     * @return
     */
    private String getUserInput() {
        String answer = null;

        System.out.print("Would you like milk and sugar with your coffee (y/n)? ");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException ioe) {
            System.err.println("IO error trying to read your answer");
        }
        if (answer == null) {
            return "no";
        }
        return answer;
    }
}

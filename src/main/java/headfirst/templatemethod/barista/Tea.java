package headfirst.templatemethod.barista;

/**
 * Created by yoyojyv on 2014. 3. 3..
 */
public class Tea extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Lemon");
    }

}

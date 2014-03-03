package headfirst.templatemethod.simplebarista;

/**
 * Created by yoyojyv on 2014. 3. 3..
 */
public class Barista {

    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();

        System.out.println("\nMaking tea...");
        tea.prepareRecipe();

        System.out.println("\nMaking coffee...");
        coffee.prepareRecipe();
    }

}

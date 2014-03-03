package headfirst.templatemethod.simplebarista;

/**
 * Created by yoyojyv on 2014. 3. 3..
 */
public class Coffee {

    void prepareRecipe() {
        boilWater();            // 물을 끓인다.
        brewCoffeeGrinds();     // 끓는 물에 커피를 우려낸다.
        pourInCup();            // 커피를 컵에 따른다.
        addSugarAndMilk();      // 설탕과 우유를 추가한다.
    }

    public void boilWater() {
        System.out.println("Boiling water");
    }

    public void brewCoffeeGrinds() {
        System.out.println("Dripping Coffee through filter");
    }

    public void pourInCup() {
        System.out.println("Pouring into cup");
    }

    public void addSugarAndMilk() {
        System.out.println("Adding Sugar and Milk");
    }
}

package headfirst.templatemethod.simplebarista;

/**
 * Created by yoyojyv on 2014. 3. 3..
 */
public class Tea {

    void prepareRecipe() {
        boilWater();        // 물을 끓인다.
        steepTeaBag();      // 끓는 물에 차를 우려낸다.
        pourInCup();        // 차를 컵에 따른다.
        addLemon();         // 레몬을 추가한다.
    }

    public void boilWater() {
        System.out.println("Boiling water");
    }

    public void steepTeaBag() {
        System.out.println("Steeping the tea");
    }

    public void addLemon() {
        System.out.println("Adding Lemon");
    }

    public void pourInCup() {
        System.out.println("Pouring into cup");
    }
}

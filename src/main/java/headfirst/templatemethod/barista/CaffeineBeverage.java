package headfirst.templatemethod.barista;

/**
 * Created by yoyojyv on 2014. 3. 3..
 */
public abstract class CaffeineBeverage {

    final void prepareRecipe() {
        boilWater();        // 물을 끓인다.                              -> 동일
        brew();             // 뜨거운 물을 이용하여 커피 또는 홍차를 우려낸다.
        pourInCup();        // 만들어진 음료를 컵에 따른다.                  -> 동일
        addCondiments();    // 각 음료에 맞는 첨가물을 추출한다.
    }

    abstract void brew();               // 각각 다른 방식으로 처리. 서브 클래스에서 구현.

    abstract void addCondiments();      // 각각 다른 방식으로 처리. 서브 클래스에서 구현.

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

}

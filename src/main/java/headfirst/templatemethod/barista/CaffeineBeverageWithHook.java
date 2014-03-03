package headfirst.templatemethod.barista;

/**
 * Created by yoyojyv on 2014. 3. 3..
 */
public abstract class CaffeineBeverageWithHook {

    void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) { // 손님이 첨가물을 넣어달라고 했을 때만, addCondiments() 를 호출
            addCondiments();
        }
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    /**
     * 별 내용이 없는 기본 메소드를 구현해 놓음.
     *
     * 이 메소드는 서브클래스에서 필요에 따라 오버라이드 할 수 있는 메소드. 후크임
     * @return
     */
    boolean customerWantsCondiments() {
        return true;
    }

}

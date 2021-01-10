package udemy;

public class Cook extends Employer implements CanCook {
    public Cook(String name) {
    }
    @Override
    public void cook() {
        System.out.println("Готовит");
    }
}
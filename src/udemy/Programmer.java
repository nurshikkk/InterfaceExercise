package udemy;

public class Programmer extends Employer implements CanCode {
    public Programmer(String name) {
    }
    @Override
    public void code() {
        System.out.println("Кодит");
    }
}
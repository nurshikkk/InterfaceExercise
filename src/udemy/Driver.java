package udemy;

public class Driver extends Employer implements CanDrive {
    public Driver(String name) {
    }
    @Override
    public void drive() {
        System.out.println("Водит");
    }
}
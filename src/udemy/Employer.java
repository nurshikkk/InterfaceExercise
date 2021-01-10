package udemy;

public abstract class Employer {
    String name;

    public String getName() {
        return name;
    }

    public void voice() {
        System.out.println(name);
    }
}
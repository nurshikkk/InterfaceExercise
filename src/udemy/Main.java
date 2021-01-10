package udemy;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Programmer p1 = new Programmer("Valera");
        Driver d1 = new Driver("Georgiy");
        Cook c1 = new Cook("John");

        ArrayList<CanCode> programmers = new ArrayList<>();
        ArrayList<CanDrive> drivers = new ArrayList<>();
        ArrayList<CanCook> cooks = new ArrayList<>();
        ArrayList<Employer> employers = new ArrayList<>();

        employers.add(p1);
        employers.add(c1);
        employers.add(d1);
        for (Employer employer : employers) {
            employer.voice();
        }

        programmers.add(p1);
        for (CanCode employer : programmers) {
            employer.code();
        }

        drivers.add(d1);
        for (CanDrive employer : drivers) {
            employer.drive();
        }

        cooks.add(c1);
        for (CanCook employer : cooks) {
            employer.cook();
        }
    }
}
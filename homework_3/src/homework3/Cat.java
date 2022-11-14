package homework3;

import homework3.Animal;

public class Cat extends Animal {
    public Cat (int runLimit) {
        super(runLimit, -1);
        type = "homework3.Cat";
    }
    @Override
    public void swim(int distance) {
        System.out.println("homework3.Cat cannot swim.");
    }
}
package homework3;

public class Animal implements IAnimal {
    protected int runLimit;
    protected int swimLimit;

    public Animal(int runLimit, int swimLimit) {
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
    }
}

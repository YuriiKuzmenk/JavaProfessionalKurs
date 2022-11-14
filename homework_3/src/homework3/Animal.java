package homework3;

public abstract class Animal implements IAnimal {
    protected int runLimit;
    protected int swimLimit;
    protected String type;
    private static int count;

    public Animal(int runLimit, int swimLimit) {
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        count++;
    }

    public static int getCount() {
        return count;
    }
    @Override
    public void run (int distance) {
        if (distance <= runLimit) {
            System.out.println(type + " can run " + distance + "m.");
        } else {
            System.out.println(type + " cannot run " + distance + "m.");
        }
    }
    @Override
    public void swim (int distance) {
        if (distance <= swimLimit) {
            System.out.println(type + " can swim " + distance + "m.");
        } else {
            System.out.println(type + " cannot swim " + distance + "m.");
        }
    }
}


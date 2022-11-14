package homework3;

/**
 * Java. Homework №3.
 *
 * @author Yurii Kuzmenko java_39e
 * @version 07.11.2022 - 13.11.2022
 * Copy of teachers vesion
 */

public class SportTrener {
    public static void main(String[] args) {
      Cat cat = new Cat(200);
      Dog dog = new Dog(500, 10);
      IAnimal[] animals = {cat, dog};
      for (IAnimal animal : animals) {
          animal.run(500);
          animal.run(200);
          animal.swim(8);
          animal.swim(12);
        }
        System.out.println("Count of animals: " + Animal.getCount());
    }
}

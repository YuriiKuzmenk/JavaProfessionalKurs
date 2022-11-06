package homework2;

/**
 * Java. Homework №2.
 *
 * @author Yurii Kuzmenko java_39e
 * @version 03.11.2022 - 06.11.2022
 */

public class MainZoo {
  public static void main(String [] args) {
        Cat cat = new Cat("Barsik", "red",3 );
        Dog dog = new Dog("Sharik", "black",5 );

        Cat emptyCat = new Cat();

        cat.voice();
        dog.voice();
        System.out.println(add(2,2));
        System.out.println(add(-5, 3.7));
        System.out.println(add("123", "456"));
    }

    static int add(int a, int b){
      return a+b;
    }

    static double add(double a, double b){
        return a+b;
    }

    static String add(String a, String b){
        return a+b;
    }
}

package lesson3;

public class Cat extends Animal {
    public Cat(String name, String color, int age) {
        super(name, color, age);
    }

    public Cat() {
        super(); //без этой строки тоже все работает, после того как мы добавили конструктор в Animal
    }

    @Override
    public void voice() {
        System.out.println("meow!");
    }
}
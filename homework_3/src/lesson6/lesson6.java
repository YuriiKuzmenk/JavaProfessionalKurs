package lesson6;

public class lesson6 {
    public static void main(String[] args) {

        SimpleBox<Integer> int1 = new SimpleBox<>(2);
        SimpleBox<Integer> int2 = new SimpleBox<>(3);

        int sum = int1.getObject() + int2.getObject();
        System.out.println(sum);

        RubberArray<Object> raInt = new RubberArray<>();
        raInt.addAll(3, 4, 5, 6);
        raInt.remove((Integer) 4);
        System.out.println(raInt);
    }
}
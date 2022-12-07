package homework9;

/**
 * Java. Homework №9.
 *
 * @author Yurii Kuzmenko java_39e
 * @version 28.11.2022 - 01.12.2022
 */

import java.util.Iterator;

public class lesson9 {
    public static void main(String[] args) {
        RubberList<Integer> rl = new RubberList<>();
        rl.addAll(3, 5, 12, 8, 15);
        System.out.println(rl);
        Iterator<Integer> iterator = rl.iterator();
        while (iterator.hasNext()) {
            Integer value = iterator.next();
            if (value > 10) {
                iterator.remove();
            }
        }
        System.out.println(rl);
        //for (Integer value: rl) {
        //    System.out.print(value + " ");
        //}
    RubberList<Integer> stack = new RubberList<>();
        for (int i = 0; i < 3; i++) {
            stack.push(i * 5);
            System.out.println(stack);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(stack.pop());
        }
    }
}
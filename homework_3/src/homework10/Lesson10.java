package homework10;

/**
 * Java. Homework №10.
 *
 * @author Yurii Kuzmenko java_39e
 * @version 01.12.2022 - 05.12.2022
 */

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Lesson10 {
    public static void main(String[] args) {
        new CommandLine().exec();
    }

    private void lesson10() {
        Queue<Integer> queue1 = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(queue1);
        System.out.println(queue1.offer(10));
        System.out.println(queue1);
        int pool = queue1.poll();
        System.out.println(pool);
        System.out.println(queue1);
        int remove = queue1.remove();
        System.out.println(remove);
        System.out.println(queue1);
        queue1.remove(10);
        queue1.remove();
        queue1.remove();
        queue1.remove();
        System.out.println(queue1);
        queue1.peek();
        Integer peek = queue1.peek();
        System.out.println(peek);
        Integer intPool = queue1.poll();
        System.out.println(intPool);
        System.out.println(queue1);

        RubberList<Integer> queue = new RubberList<>();
        queue.addAll(1, 2, 3, 4, 5);

        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue);
    }



}

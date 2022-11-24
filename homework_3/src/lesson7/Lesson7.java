package lesson7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Lesson7 {
    public static void main(String[] args) {
        List<Integer> numbers =new ArrayList<>();
        numbers.addAll(Arrays.asList(4, 6, 2, 9, 1));

        /*     for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
  */

        for (Integer item: numbers) {
            System.out.print(item + " ");
        }
        System.out.println();

        int[] array={5, 7, 3, 2, 6};
        for(int item : array) {
            System.out.print(item + " ");
        }
        System.out.println();

        RubberArray<Integer> ra = new RubberArray<>();
        ra.addAll(9, 3, 5, 7, 0);
      /*  for(Integer item : ra) {
            System.out.print(item + " ");
        }
    */
        Iterator<Integer>iterator = ra.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}

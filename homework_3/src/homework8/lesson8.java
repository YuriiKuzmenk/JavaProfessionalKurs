package homework8;

/**
 * Java. Homework №8.
 *
 * @author Yurii Kuzmenko java_39e
 * @version 24.11.2022 - 28.11.2022
 */

public class lesson8 {
    public static void main(String[] args) {
        RubberList<Integer> rl = new RubberList<>();
        System.out.println(rl);
        rl.add(12);
        //rl.add(4);
       // rl.add(8);
        rl.add(3);
        System.out.println(rl);
        rl.remove(12);
       // rl.remove(8);
      //  rl.remove(3);
        System.out.println(rl);
    }
}

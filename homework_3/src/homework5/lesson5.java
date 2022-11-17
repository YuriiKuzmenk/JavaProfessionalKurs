package homework5;

/**
 * Java. Homework №5.
 *
 * @author Yurii Kuzmenko java_39e
 * @version 14.11.2022 - 17.11.2022
 */

public class lesson5 {
    public static void main(String[] args) {
        RubberArray ra = new RubberArray();
        System.out.println(ra);
        System.out.println(ra.getSize());
        //ra.add(12);
        //ra.add(3);
        //ra.add(5);
        ra.addAll(12, 5, 3);
        System.out.println(ra);
       // System.out.println(ra.getSize());
       // System.out.println("ra[1] = " + ra.getIndex(1));
      //  ra.remove(0);
       // System.out.println(ra);
      //  ra.remove(0);
       // System.out.println(ra);
       // ra.remove(0);
       // System.out.println(ra);
        System.out.println(ra.contains(5));
        System.out.println(ra.contains(8));
        ra.remove(Integer.valueOf(5));
        System.out.println(ra);
    }
}

package homework6;

/**
 * Java. Homework №6.
 *
 * @author Yurii Kuzmenko java_39e
 * @version 17.11.2022 - 20.11.2022
 */

public class CopyLesson5 {
    public static void main(String[] args) {
        RubberArray6 ra = new RubberArray6();
        ra.addAll("abc", "def", "c", "d");
        System.out.println("ra " + ra);
        System.out.println();

        RubberArray6 raInt=new RubberArray6();
        raInt.addAll(1.1, 2, 3.4, 4);
        System.out.println("raInt" + raInt);
        raInt.remove(3.4);
        System.out.println("raInt" + raInt);
        System.out.println();

        RubberArray6 raMix=new RubberArray6();
        raMix.addAll(1.1, 2, "abc", true);
        System.out.println("raMix" + raMix);
        raMix.remove(true);
        System.out.println("raMix" + raMix);
        double f =(double)raMix.get(0);
        System.out.println("raMix value of element with index [" + 0 + "] *2 = " + f*2);
        System.out.println();

        System.out.println("Size of ra array: " + ra.getSize());
        ra.addAll(12, 5, 3.6, -8, 'f');
        System.out.println("ra " + ra);
        System.out.println("contains 5 ? : " + ra.contains(5));
        System.out.println("contains 8 ? : " + ra.contains(8));
        System.out.println("contains 3.6 ? : " + ra.contains(3.6));
        System.out.println("contains \"abc\" ? : " + ra.contains("abc"));
        System.out.println("contains \"f\" ? : " + ra.contains("f"));
        System.out.println("contains \'f\' ? : " + ra.contains('f'));
        ra.addAll(true);
        ra.remove("d");
        System.out.println("ra " + ra);
        System.out.println("contains boolean true ? : " + ra.contains(true));
        ra.remove(true);
        System.out.println("ra " + ra);
    }
}

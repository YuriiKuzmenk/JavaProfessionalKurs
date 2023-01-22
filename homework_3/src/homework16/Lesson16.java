package homework16;

/**
 * Java. Homework №16.
 *
 * @author Yurii Kuzmenko java_39e
 * @version 22.12.2022 - 12.01.2023
 */

public class Lesson16 {
    public static void main(String[] args) {
        Operationable addition = (x, y) -> { return x + y; };
        Operationable substraction = (x, y) -> x - y;
        Operationable multiplication = (x, y) -> { return x * y; };
        Operationable divide1 = (x, y) -> { return x / y; };
        Operationable divide2 = (x, y) -> { return x % y; };


        int a = addition.calculate(5, 5);
        int b = substraction.calculate(8, 3);
        int c = multiplication.calculate(5, 5);
        int d = divide1.calculate(8, 3);
        int e = divide2.calculate(8, 3);
        int i=0;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        do {

            if (i==1) {System.out.print(",");};
            if (i==0) {System.out.print(d);}
            else {
                d=divide1.calculate(e*10, 3);
                e=divide2.calculate(d,3);
                System.out.print(d);
            };
            i++;

        } while (d!=0 || i!=3);
    }
}

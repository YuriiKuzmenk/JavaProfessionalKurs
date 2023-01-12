package lesson16;

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


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d + "," + e);
    }
}

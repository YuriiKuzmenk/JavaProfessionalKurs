package basic_Java.hw1;

public class Calculator {

    public static void main(String[] args) {
        int firstNumeric = 123;
        int secondNumeric = 2;

    add(firstNumeric, secondNumeric);

    }

    private static void add (double firstArgument, double secondArgument) {
        System.out.println("We are have 2 numeric: first numeric = " + firstArgument+ "; second numeric = " + secondArgument);
        System.out.println("Operation add: (first numeric) + (second numeric)");
        System.out.println(firstArgument+secondArgument+"="+firstArgument+secondArgument);
    }
}

package lesson11;

import java.util.List;
import java.util.Scanner;

public class DataUtil {
    private static Scanner scanner = new Scanner(System.in);

    public static void print(List<Employee> toPrint) {
        for (Employee employee: toPrint) {
            System.out.println(employee);
        }
    }

    public static String getString(String promt) {
        System.out.print(promt);
        String value = scanner.next();
        return value;
    }

    public static int getInt (String promt) {
        System.out.print(promt);
        int value = scanner.nextInt();
        return value;
    }

    public static Employee getEmployee(String promt) {
        System.out.print(promt);
        //TODO:дописать
        return null;
    }
    public static Employee getEmployeePart(String promt) {
        System.out.print(promt);
        String position = scanner.next();
        int salary;
        int
        //TODO:дописать
        return null;
    }
}

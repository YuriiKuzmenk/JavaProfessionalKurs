package lesson10;

import java.util.ArrayList;
import java.util.List;

public class DbInit {
    public static List<Employee> init(){
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("john", "boss", 1500, 45));
        employees.add(new Employee("gina", "assistent", 650, 21));
        employees.add(new Employee("bill", "engineer", 1050, 34));
        employees.add(new Employee("john", "engineer", 1100, 35));
        return employees;
    }
}
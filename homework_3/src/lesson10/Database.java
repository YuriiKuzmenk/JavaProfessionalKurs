package lesson10;

import homework10.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Database {
    List<homework10.Employee> employees = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void init(List<homework10.Employee> employees) {
        this.employees.addAll(employees);
    }

    public void create() {
        System.out.println("create: ");
        String name = scanner.next();
        String position = scanner.next();
        int salary = scanner.nextInt();
        int age = scanner.nextInt();
        employees.add(new homework10.Employee(name, position, salary, age));
    }

    public void read() {
        for (homework10.Employee employee : employees) {
            System.out.println(employee);
        }
    }

    private homework10.Employee findByName (String name){
        for (homework10.Employee employee : employees) {
            if (employee.getName().equalsIgnoreCase(name)) {
                return employee;
            }
        }
        return null;
    }

    private homework10.Employee findById(int id){
        for (homework10.Employee employee : employees) {
            if (employee.getId()==id) {
                return employee;
            }
        }
        return null;
    }

    public void update() {
        System.out.print("update, find by id: ");
        int id = scanner.nextInt();
        homework10.Employee employee = findById(id);
        if (employee != null) {
            System.out.print("update (position, salary, age): ");
            String position = scanner.next();
            int salary = scanner.nextInt();
            int age = scanner.nextInt();
            employee.update(position, salary, age);
            System.out.println("Updated " + employee);
        }
    }

    public void delete() {
        System.out.print("remove, find by id: ");
        int id = scanner.nextInt();
        Employee employee = findById(id);
        if (employee != null) {
            employees.remove(employee);
            System.out.println("Deleted " + employee);
        }
    }
}

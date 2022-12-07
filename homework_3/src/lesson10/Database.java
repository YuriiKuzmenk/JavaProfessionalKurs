package lesson11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Database {
    List<Employee> employees = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void init(List<Employee> employees) {
        this.employees.addAll(employees);
    }

    public void create() {
        System.out.print("create: ");
        String name = scanner.next();
        String position = scanner.next();
        int salary = scanner.nextInt();
        int age = scanner.nextInt();
        employees.add(new Employee(name, position, salary, age));
    }

    public void read() {
        print(employees);
    }

    public void find() {
        String name = DataUtil.getString("find: ");
        List<Employee> found = new ArrayList<>();
        for (Employee employee:employees) {
           //if (employee.getName().equalsIgnoreCase(name) {
             if (employee.getName().contains(name)) {
                found.add(employee);
            }
        }
        print(found);

    }

    private void print(List<Employee> toPrint) {
        for(Employee employee: toPrint) {
            System.out.println(employee);
        }
    }

    /*
    private Employee findByName (String name){
        for (Employee employee : employees) {
            if (employee.getName().equalsIgnoreCase(name)) {
                return employee;
            }
        }
        return null;
    }
     */

    private Employee findById(int id){
        for (Employee employee : employees) {
            if (employee.getId()==id) {
                return employee;
            }
        }
        return null;
    }

    public void update() {
        int id = DataUtil.getInt("");
        Employee employee = findById(id);
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

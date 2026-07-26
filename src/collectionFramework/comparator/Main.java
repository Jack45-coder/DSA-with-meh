package collectionFramework.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(3, "Ravish", 76000.00));
        employees.add(new Employee(1, "Satish", 56000.00));
        employees.add(new Employee(4, "Rohit", 66000.00));
        employees.add(new Employee(2, "Prince", 57000.00));
        employees.add(new Employee(5, "Deepak", 96000.00));

        System.out.println("Before sorted");
        for(Employee employee : employees){
            System.out.println("Employee: " + employee.name + " | Salary: " + employee.salary);
        }

        System.out.println("After sorted");

        Collections.sort(employees, new MyCustomComparator());

        for(Employee employee : employees){
            System.out.println("Employee: " + employee.name + " | Salary: " + employee.salary);
        }
    }
}

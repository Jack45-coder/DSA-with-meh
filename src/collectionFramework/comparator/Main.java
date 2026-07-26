package collectionFramework.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(3, "Ravish", 76000.00));
        employees.add(new Employee(1, "Satish", 56000.00));
        employees.add(new Employee(4, "Rohit", 96000.00));
        employees.add(new Employee(2, "Prince", 57000.00));
        employees.add(new Employee(5, "Deepak", 96000.00));

        System.out.println("Before sorted");
        for(Employee employee : employees){
            System.out.println("Employee: " + employee.name + " | Salary: " + employee.salary);
        }

        System.out.println("After sorted");

        // Using Custom Comparator Class:-
//        Collections.sort(employees, new MyCustomComparator());

        // Using Comparator with Anonymous Class:-
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                if (e1.salary < e2.salary){
                    return 1;
                }else {
                    return -1;
                }
            }
        });

        for(Employee employee : employees){
            System.out.println("Employee: " + employee.name + " | Salary: " + employee.salary);
        }


        // cond -> sort in dec order of salary
        // if salary is same then sort in increasing order of name
        System.out.println("After: Sorted salary first Then name");
        Collections.sort(employees, new Comparator<Employee>(){
            @Override
            public int compare(Employee e1, Employee e2) {
                if (e1.salary != e2.salary){
                    return Double.compare(e2.salary, e1.salary);
                }
                return e1.name.compareTo(e2.name);
            }
        });

        for(Employee employee : employees){
            System.out.println("Employee: " + employee.name + " | Salary: " + employee.salary);
        }

    }
}

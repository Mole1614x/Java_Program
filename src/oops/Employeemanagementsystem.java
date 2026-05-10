package oops;
import java.util.*;

class Employee {
    int Emp_id;
    String Emp_name;
    double Salary;

    public Employee(int emp_id, String emp_name, double salary) {
        Emp_id = emp_id;
        Emp_name = emp_name;
        Salary = salary;
    }

    double calculateSalary() {
        double sal = Salary + (Salary * 0.20) + (Salary * 0.10);
        return sal;
    }

    void display() {
        System.out.println("ID: " + Emp_id);
        System.out.println("Name: " + Emp_name);
        System.out.println("Basic Salary: " + Salary);
        System.out.println("Total Salary: " + calculateSalary());
        System.out.println("----------------------");
    }
}

public class Employeemanagementsystem {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter number of employees: "); // ✅ added prompt
        int n = s.nextInt();

        Employee[] emp = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Employee " + (i + 1));

            System.out.print("ID: "); // ✅ better formatting
            int id = s.nextInt();

            s.nextLine(); // ✅ correct buffer handling

            System.out.print("Name: ");
            String name = s.nextLine();

            System.out.print("Basic Salary: ");
            double salary = s.nextDouble();

            emp[i] = new Employee(id, name, salary);
        }

        // Display all employees
        System.out.println("\n--- Employee Details ---");
        for (int i = 0; i < n; i++) {
            emp[i].display();
        }

        s.close(); // ✅ good practice
    }
}
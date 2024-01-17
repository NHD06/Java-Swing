package JavaOOP;

import java.util.Scanner;

public class Employee {
    private String name;
    private double salary;
    public void displayDetails(){
        System.out.println("Name : " + this.name);
        System.out.println("Salary: " + this.salary);
    }

    public static class Manager extends Employee {
        Employee emp = new Employee();
        private String department; 
        @Override
        public void displayDetails() {
            System.out.println("Department: " + department);
            super.displayDetails();
        }
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        Scanner sc = new Scanner(System.in);
        Manager mgr = new Manager();
        emp.name = sc.nextLine();
        emp.salary = Double.parseDouble(sc.nextLine());
        mgr.department = sc.nextLine();
        System.out.println("Employee Details");
        emp.displayDetails();
        mgr.displayDetails();
    }
}

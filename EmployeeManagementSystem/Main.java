package EmployeeManagementSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeManager manager = new EmployeeManager();

        while (true) {
            System.out.println("\nEmployee Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. Remove Employee");
            System.out.println("3. Display All Employees");
            System.out.println("4. Search Employee by ID");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Employee ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Employee Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Department: ");
                    String department = scanner.nextLine();
                    System.out.print("Enter Salary: ");
                    double salary = scanner.nextDouble();
                    Employee emp = new Employee(id, name, department, salary);
                    manager.addEmployee(emp);
                    break;

                case 2:
                    System.out.print("Enter Employee ID to remove: ");
                    int removeId = scanner.nextInt();
                    manager.removeEmployee(removeId);
                    break;

                case 3:
                    manager.displayAllEmployees();
                    break;

                case 4:
                    System.out.print("Enter Employee ID to search: ");
                    int searchId = scanner.nextInt();
                    Employee searchedEmp = manager.searchEmployeeById(searchId);
                    if (searchedEmp != null) {
                        System.out.println("Employee Found: " + searchedEmp);
                    } else {
                        System.out.println("Employee with ID " + searchId + " not found.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting Employee Management System.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}


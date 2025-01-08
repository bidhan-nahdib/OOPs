package EmployeeManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    private List<Employee> employees;

    public EmployeeManager() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
        System.out.println("Employee added: " + employee);
    }

    public void removeEmployee(int id) {
        Employee toRemove = null;
        for (Employee emp : employees) {
            if (emp.getId() == id) {
                toRemove = emp;
                break;
            }
        }
        if (toRemove != null) {
            employees.remove(toRemove);
            System.out.println("Employee removed: " + toRemove);
        } else {
            System.out.println("Employee with ID " + id + " not found.");
        }
    }

    public void displayAllEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees to display.");
        } else {
            System.out.println("Employee List:");
            for (Employee emp : employees) {
                System.out.println(emp);
            }
        }
    }

    public Employee searchEmployeeById(int id) {
        for (Employee emp : employees) {
            if (emp.getId() == id) {
                return emp;
            }
        }
        return null;
    }
}


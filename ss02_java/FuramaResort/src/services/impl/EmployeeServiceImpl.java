package services.impl;

import models.Employee;
import services.EmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    private static List<Employee> employeeList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        for (Employee employee : employeeList){
            System.out.println(employee.toString());
        }
    }

    @Override
    public void addNew() {
        System.out.println("Enter ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Date of Birth: ");
        String dateOfBirth = scanner.nextLine();
        System.out.println("Enter Full Name: ");
        String fullName = scanner.nextLine();
        System.out.println("Enter Gender: ");
        String gender = scanner.nextLine();
        System.out.println("Enter Citizen ID: ");
        String citizenID = scanner.nextLine();
        System.out.println("Enter Phone Number: ");
        String phoneNumber = scanner.nextLine();
        System.out.println("Enter Email: ");
        String email = scanner.nextLine();
        System.out.println("Enter Education Level: ");
        String educationLevel = scanner.nextLine();
        System.out.println("Enter Position: ");
        String position = scanner.nextLine();
        System.out.println("Enter Salary: ");
        int salary = Integer.parseInt(scanner.nextLine());

        Employee employee = new Employee(id, fullName, dateOfBirth, gender, citizenID, phoneNumber, email, educationLevel, position, salary);
        employeeList.add(employee);
    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {
        System.out.println("Enter Employee's ID to delete: ");
        int id = Integer.parseInt(scanner.nextLine());
        employeeList.remove(id);
        System.out.println("Employee Delete Successfully.");
    }
}

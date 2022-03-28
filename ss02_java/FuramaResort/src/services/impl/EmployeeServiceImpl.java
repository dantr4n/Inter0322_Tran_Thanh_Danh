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
        System.out.println("Enter Full Name: ");
        String fullName = scanner.nextLine();
        System.out.println("Enter Date of Birth: ");
        String dateOfBirth = scanner.nextLine();
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
        System.out.println("Enter Employee's ID to update: ");
        int id = Integer.parseInt(scanner.nextLine());
        for(Employee employee : employeeList){
            if (employee.getId() == id){
                System.out.println("Selected Employee Information: ");
                System.out.println(employee.toString());
                System.out.println("Enter New ID: ");
                int newID = Integer.parseInt(scanner.nextLine());
                employee.setId(newID);
                System.out.println("Enter New Full Name: ");
                String fullName = scanner.nextLine();
                employee.setFullName(fullName);
                System.out.println("Enter New Date of Birth: ");
                String dateOfBirth = scanner.nextLine();
                employee.setDateOfBirth(dateOfBirth);
                System.out.println("Enter New Gender: ");
                String gender = scanner.nextLine();
                employee.setGender(gender);
                System.out.println("Enter New Citizen ID: ");
                String citizenID = scanner.nextLine();
                employee.setCitizenID(citizenID);
                System.out.println("Enter New Phone Number: ");
                String phoneNumber = scanner.nextLine();
                employee.setPhoneNumber(phoneNumber);
                System.out.println("Enter New Email: ");
                String email = scanner.nextLine();
                employee.setEmail(email);
                System.out.println("Enter New Education Level: ");
                String educationLevel = scanner.nextLine();
                employee.setEducationLevel(educationLevel);
                System.out.println("Enter New Position: ");
                String position = scanner.nextLine();
                employee.setPosition(position);
                System.out.println("Enter New Salary: ");
                int salary = Integer.parseInt(scanner.nextLine());
                employee.setSalary(salary);
            } else{
                System.out.println("Invalid ID!");
            }
        }

    }

    @Override
    public void delete() {
//        System.out.println("Enter Employee's ID to delete: ");
//        int id = Integer.parseInt(scanner.nextLine());
//        employeeList.remove(id);
//        System.out.println("Employee Delete Successfully.");
    }
}

package services.impl;

import models.Customer;
import models.Employee;
import services.CustomerService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    private static List<Customer> customerList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        for (Customer customer : customerList){
            System.out.println(customer.toString());
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
        System.out.println("Enter Customer Type: ");
        String customerType = scanner.nextLine();
        System.out.println("Enter Address: ");
        String customerAddress = scanner.nextLine();

        Customer customer = new Customer(id, fullName, dateOfBirth, gender, citizenID, phoneNumber, email, customerType, customerAddress);
        customerList.add(customer);
    }

    @Override
    public void edit() {
        System.out.println("Enter Employee's ID to update: ");
        int id = Integer.parseInt(scanner.nextLine());
        for(Customer customer : customerList) {
            if (customer.getId() == id) {
                System.out.println("Selected Employee Information: ");
                System.out.println(customer.toString());
                System.out.println("Enter New ID: ");
                int newID = Integer.parseInt(scanner.nextLine());
                customer.setId(newID);
                System.out.println("Enter New Full Name: ");
                String fullName = scanner.nextLine();
                customer.setFullName(fullName);
                System.out.println("Enter New Date of Birth: ");
                String dateOfBirth = scanner.nextLine();
                customer.setDateOfBirth(dateOfBirth);
                System.out.println("Enter New Gender: ");
                String gender = scanner.nextLine();
                customer.setGender(gender);
                System.out.println("Enter New Citizen ID: ");
                String citizenID = scanner.nextLine();
                customer.setCitizenID(citizenID);
                System.out.println("Enter New Phone Number: ");
                String phoneNumber = scanner.nextLine();
                customer.setPhoneNumber(phoneNumber);
                System.out.println("Enter New Email: ");
                String email = scanner.nextLine();
                customer.setEmail(email);
                System.out.println("Enter New Customer Type: ");
                String customerType = scanner.nextLine();
                customer.setCustomerType(customerType);
                System.out.println("Enter New Customer Address: ");
                String customerAddress = scanner.nextLine();
                customer.setCustomerAddress(customerAddress);
            } else {
                System.out.println("Invalid ID!");
            }
        }
    }

    @Override
    public void delete() {

    }
}

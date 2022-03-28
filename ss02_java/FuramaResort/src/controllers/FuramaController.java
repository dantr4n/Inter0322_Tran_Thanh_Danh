package controllers;

import services.impl.CustomerServiceImpl;
import services.impl.EmployeeServiceImpl;
import services.impl.FacilityServiceImpl;

import java.util.Scanner;

public class FuramaController {

    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu(){
        boolean check = true;

        while (check){
            System.out.println("Please choose a number in the Menu: ");
            System.out.println("1.\tEmployee Management");
            System.out.println("2.\tCustomer Management");
            System.out.println("3.\tFacility Management");
            System.out.println("4.\tBooking Management");
            System.out.println("5.\tPromotion Management");
            System.out.println("6.\tExit");
            System.out.print("-> ");
            Scanner scanner = new Scanner(System.in);

            switch(Integer.parseInt(scanner.nextLine())){
                case 1:
                    displayEmployeeMenu();
                    break;
                case 2:
                    displayCustomerMenu();
                    break;
                case 3:
                    displayFacilityMenu();
                    break;
                case 4:
                    displayBookingMenu();
                    break;
                case 5:
                    displayPromotionMenu();
                    break;
                case 6:
                    return;
            }
            System.out.println("-------------------------");
        }
    }

    public static void displayEmployeeMenu(){
        boolean check = true;
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();

        while (check){
            System.out.println("=> \tEmployee Management:".toUpperCase());
            System.out.println("-> 1.\tDisplay list employees");
            System.out.println("-> 2.\tAdd new employee");
            System.out.println("-> 3.\tEdit employee");
            System.out.println("-> 4.\tReturn main menu");
            Scanner scanner = new Scanner(System.in);
            switch (Integer.parseInt(scanner.nextLine())){
                case 1:
                    employeeService.display();
                    break;
                case 2:
                    employeeService.addNew();
                    break;
                case 3:
                    employeeService.edit();
                    break;
                case 4:
                    return;
            }
        }
    }

    public static void displayCustomerMenu(){
        boolean check = true;
        CustomerServiceImpl customerService = new CustomerServiceImpl();

        while (check){
            System.out.println("=> \tCustomer Management:".toUpperCase());
            System.out.println("-> 1.\tDisplay list customers");
            System.out.println("-> 2.\tAdd new customers");
            System.out.println("-> 3.\tEdit customers");
            System.out.println("-> 4.\tReturn main menu");
            Scanner scanner = new Scanner(System.in);

            switch (Integer.parseInt(scanner.nextLine())){
                case 1:
                    customerService.display();
                    break;
                case 2:
                    customerService.addNew();
                    break;
                case 3:
                    customerService.edit();
                    break;
                case 4:
                    return;
            }

        }
    }

    public static void displayFacilityMenu(){
        boolean check = true;
        FacilityServiceImpl facilityService = new FacilityServiceImpl();

        while (check){
            System.out.println("=> \tFacility Management".toUpperCase());
            System.out.println("-> 1.\tDisplay list facility");
            System.out.println("-> 2.\tAdd new facility");
            System.out.println("-> 3.\tEdit facility");
            System.out.println("-> 4.\tReturn main menu");
            Scanner scanner = new Scanner(System.in);

            switch (Integer.parseInt(scanner.nextLine())){
                case 1:
            }
        }
    }

    public static void displayBookingMenu(){
        boolean check = true;

        while (true) {
            System.out.println("=> \tBooking Management".toUpperCase());
            System.out.println("-> 1.\tAdd new booking");
            System.out.println("-> 2.\tDisplay list booking");
            System.out.println("-> 3.\tCreate new contacts");
            System.out.println("-> 4.\tDisplay list contacts");
            System.out.println("-> 5.\tEdit contacts");
            System.out.println("-> 6.\tReturn main menu");
            Scanner scanner = new Scanner(System.in);

            switch (Integer.parseInt(scanner.nextLine())){
                case 1:
            }
        }
    }

    public static void displayPromotionMenu(){
        boolean check = true;

        while (true){
            System.out.println("=> \tPromotion Management".toUpperCase());
            System.out.println("-> 1.\tDisplay list customers use service");
            System.out.println("-> 2.\tDisplay list customers get voucher");
            System.out.println("-> 3.\tReturn main menu");System.out.println("-> 6.\tReturn main menu");
            Scanner scanner = new Scanner(System.in);

            switch (Integer.parseInt(scanner.nextLine())){
                case 1:
            }
        }
    }

}

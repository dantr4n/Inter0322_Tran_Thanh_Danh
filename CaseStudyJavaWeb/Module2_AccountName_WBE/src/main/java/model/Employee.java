package model;

public class Employee extends Person{
    private int educationDegree;
    private int division;
    private int position;
    private double salary;
    private String username;

    public Employee() {
    }

    public Employee(int id) {
        super(id);
    }

    public Employee(int id, String name, String birthday, boolean gender, String idCard, String phoneNumber, String email, String address, int educationDegree, int division, int position, double salary, String username) {
        super(id, name, birthday, gender, idCard, phoneNumber, email, address);
        this.educationDegree = educationDegree;
        this.division = division;
        this.position = position;
        this.salary = salary;
        this.username = username;
    }

    public int getEducationDegree() {
        return educationDegree;
    }

    public void setEducationDegree(int educationDegree) {
        this.educationDegree = educationDegree;
    }

    public int getDivision() {
        return division;
    }

    public void setDivision(int division) {
        this.division = division;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}

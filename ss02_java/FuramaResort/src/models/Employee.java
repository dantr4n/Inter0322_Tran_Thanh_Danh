package models;

public class Employee extends Person {
    private String educationLevel;
    private String position;
    private int salary;

    public Employee(){

    }

    public Employee(int id,
                    String fullName,
                    String dateOfBirth,
                    String gender,
                    String citizenID,
                    String phoneNumber,
                    String email,
                    String educationLevel,
                    String position,
                    int salary){
        super(id, fullName, dateOfBirth, gender, citizenID, phoneNumber, email);
        this.educationLevel = educationLevel;
        this.position = position;
        this.salary = salary;
    }

    public Employee(String educationLevel,
                    String position,
                    int salary){
        this.educationLevel =educationLevel;
        this.position = position;
        this.salary = salary;
    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + getId() +
                ", fullName='" + getFullName() + '\'' +
                ", dateOfBirth='" + getDateOfBirth() + '\'' +
                ", gender='" + getGender() + '\'' +
                ", citizenID='" + getCitizenID() + '\'' +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", educationLevel='" + educationLevel + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}

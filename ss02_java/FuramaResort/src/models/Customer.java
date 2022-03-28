package models;

public class Customer extends Person{
    private String customerType;
    private String customerAddress;

    public Customer(){

    }

    public Customer(int id,
                    String fullName,
                    String dateOfBirth,
                    String gender,
                    String citizenID,
                    String phoneNumber,
                    String email,
                    String customerType,
                    String customerAddress) {
        super(id, fullName, dateOfBirth, gender, citizenID, phoneNumber, email);
        this.customerType = customerType;
        this.customerAddress = customerAddress;
    }

    public Customer(String customerType, String customerAddress) {
        this.customerType = customerType;
        this.customerAddress = customerAddress;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + getId() +
                ", fullName='" + getFullName() + '\'' +
                ", dateOfBirth='" + getDateOfBirth() + '\'' +
                ", gender='" + getGender() + '\'' +
                ", citizenID='" + getCitizenID() + '\'' +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", customerType='" + customerType + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                '}';
    }
}

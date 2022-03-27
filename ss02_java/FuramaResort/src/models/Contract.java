package models;

public class Contract {
    private int contractID;
    private int bookingID;
    private float deposit;
    private float totalPayment;
    private int customerID;

    public Contract(){

    }

    public Contract(int contractID, int bookingID, float deposit, float totalPayment, int customerID) {
        this.contractID = contractID;
        this.bookingID = bookingID;
        this.deposit = deposit;
        this.totalPayment = totalPayment;
        this.customerID = customerID;
    }

    public int getContractID() {
        return contractID;
    }

    public void setContractID(int contractID) {
        this.contractID = contractID;
    }

    public int getBookingID() {
        return bookingID;
    }

    public void setBookingID(int bookingID) {
        this.bookingID = bookingID;
    }

    public float getDeposit() {
        return deposit;
    }

    public void setDeposit(float deposit) {
        this.deposit = deposit;
    }

    public float getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(float totalPayment) {
        this.totalPayment = totalPayment;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }
}

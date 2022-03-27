package models;

public class Booking {
    private int bookingID;
    private String staringDate;
    private String endingDate;
    private String customerID;
    private String serviceName;
    private String serviceType;

    public Booking(){

    }

    public Booking(int bookingID, String staringDate, String endingDate, String customerID, String serviceName, String serviceType) {
        this.bookingID = bookingID;
        this.staringDate = staringDate;
        this.endingDate = endingDate;
        this.customerID = customerID;
        this.serviceName = serviceName;
        this.serviceType = serviceType;
    }

    public int getBookingID() {
        return bookingID;
    }

    public void setBookingID(int bookingID) {
        this.bookingID = bookingID;
    }

    public String getStaringDate() {
        return staringDate;
    }

    public void setStaringDate(String staringtDate) {
        this.staringDate = staringtDate;
    }

    public String getEndingDate() {
        return endingDate;
    }

    public void setEndingDate(String endingDate) {
        this.endingDate = endingDate;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }
}

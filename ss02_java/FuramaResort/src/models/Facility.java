package models;

public abstract class Facility {
    private String serviceName;
    private float residentialFloorArea;
    private float rentalPrice;
    private int maxNumberOfPeople;
    private String rentalType;

    public Facility(){

    }

    public Facility(String serviceName, float residentialFloorArea, float rentalPrice, int maxNumberOfPeople, String rentalType) {
        this.serviceName = serviceName;
        this.residentialFloorArea = residentialFloorArea;
        this.rentalPrice = rentalPrice;
        this.maxNumberOfPeople = maxNumberOfPeople;
        this.rentalType = rentalType;
    }

    public String getServiceName(){
        return serviceName;
    }

    public void setServiceName(String serviceName){
        this.serviceName = serviceName;
    }

    public float getResidentialFloorArea() {
        return residentialFloorArea;
    }

    public void setResidentialFloorArea(float residentialFloorArea) {
        this.residentialFloorArea = residentialFloorArea;
    }

    public float getRentalPrice() {
        return rentalPrice;
    }

    public void setRentalPrice(float rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    public int getMaxNumberOfPeople() {
        return maxNumberOfPeople;
    }

    public void setMaxNumberOfPeople(int maxNumberOfPeople) {
        this.maxNumberOfPeople = maxNumberOfPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }
}

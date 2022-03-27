package models;

public class Villa extends Facility {
    private String roomStandard;
    private float poolArea;
    private int numberOfFloors;

    public Villa(){

    }

    public Villa(String serviceName, float residentialFloorArea, float rentalPrice, int maxNumberOfPeople, String rentalType, String roomStandard, float poolArea, int numberOfFloors) {
        super(serviceName, residentialFloorArea, rentalPrice, maxNumberOfPeople, rentalType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public Villa(String roomStandard, float poolArea, int numberOfFloors) {
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public float getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(float poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "serviceName='" + getServiceName() + '\'' +
                ", residentialFloorArea=" + getResidentialFloorArea() +
                ", rentalPrice=" + getRentalPrice() +
                ", maxNumberOfPeople=" + getMaxNumberOfPeople() +
                ", rentalType='" + getRentalType() + '\'' +
                ", roomStandard='" + roomStandard + '\'' +
                ", poolArea=" + poolArea +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }
}

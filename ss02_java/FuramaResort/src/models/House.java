package models;

public class House extends Facility {
    private String roomStandard;
    private int numberOfFloors;

    public House(){

    }

    public House(String serviceName, float residentialFloorArea, float rentalPrice, int maxNumberOfPeople, String rentalType, String roomStandard, int numberOfFloors) {
        super(serviceName, residentialFloorArea, rentalPrice, maxNumberOfPeople, rentalType);
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public House(String roomStandard, int numberOfFloors) {
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "House{" +
                "serviceName='" + getServiceName() + '\'' +
                ", residentialFloorArea=" + getResidentialFloorArea() +
                ", rentalPrice=" + getRentalPrice() +
                ", maxNumberOfPeople=" + getMaxNumberOfPeople() +
                ", rentalType='" + getRentalType() + '\'' +
                ", roomStandard='" + roomStandard + '\'' +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }
}

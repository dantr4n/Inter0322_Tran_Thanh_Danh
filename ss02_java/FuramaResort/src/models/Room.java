package models;

public class Room extends Facility {
    private String freeService;

    public Room(){

    }

    public Room(String serviceName, float residentialFloorArea, float rentalPrice, int maxNumberOfPeople, String rentalType, String freeService) {
        super(serviceName, residentialFloorArea, rentalPrice, maxNumberOfPeople, rentalType);
        this.freeService = freeService;
    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "serviceName='" + getServiceName() + '\'' +
                ", residentialFloorArea=" + getResidentialFloorArea() +
                ", rentalPrice=" + getRentalPrice() +
                ", maxNumberOfPeople=" + getMaxNumberOfPeople() +
                ", rentalType='" + getRentalType() + '\'' +
                ", freeService='" + freeService + '\'' +
                '}';
    }
}

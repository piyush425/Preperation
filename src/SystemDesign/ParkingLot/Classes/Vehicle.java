package SystemDesign.ParkingLot.Classes;

public class Vehicle {

    private String licensePlate;

    public VehilcleTypeEnum vehicleType;


    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }


    public Vehicle(String licensePlate, VehilcleTypeEnum vehicleType) {
        this.licensePlate = licensePlate;
        this.vehicleType = vehicleType;
    }

    public VehilcleTypeEnum getVehicleType() {
        return vehicleType;
    }



}

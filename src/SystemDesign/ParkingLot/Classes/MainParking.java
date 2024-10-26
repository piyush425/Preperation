package SystemDesign.ParkingLot.Classes;

public class MainParking{
    public static void main(String[] args) {
        ParkingALot parkingALot=new ParkingALot("Central Parking", "123 Main St");

        Floor floor1=new Floor(1L);
        Floor floor2=new Floor(2L);

        floor1.addSpot(new ParkingSpot("CAR"));
        floor1.addSpot(new ParkingSpot("MOTORCYCLE"));

        floor2.addSpot(new ParkingSpot("CAR"));
        floor2.addSpot(new ParkingSpot("MOTORCYCLE"));

        parkingALot.addFloor(floor1);
        parkingALot.addFloor(floor2);

        Vehicle vehicle=new Vehicle("BR90875",VehilcleTypeEnum.CAR);

        ParkingSpot spot=floor1.checkAvailiableSpot(vehicle.getVehicleType());


        System.out.println(spot.toString());
    }
}

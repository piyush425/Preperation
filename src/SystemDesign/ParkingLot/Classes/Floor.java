package SystemDesign.ParkingLot.Classes;

import java.util.ArrayList;
import java.util.List;

public class Floor {


    private boolean isAvailiable;
    private Long floorNo;

    private  List<ParkingSpot> parkingSpots;

    public Floor(Long floorNo) {
        this.floorNo = floorNo;
        this.parkingSpots=new ArrayList<>();
    }

    public void addSpot(ParkingSpot parkingSpot){
        parkingSpots.add(parkingSpot);
    }

    public List<ParkingSpot> getSpot(){
        return parkingSpots;
    }

    public ParkingSpot checkAvailiableSpot(VehilcleTypeEnum vehicleType){

        for (ParkingSpot spot:parkingSpots){
            if (spot.isAvailiable()){
                if (spot.getSpotType().equalsIgnoreCase(vehicleType.toString())){
                    return spot;
                }
            }
        }
        return null;

    }


    public boolean isAvailiable() {
        for (ParkingSpot parkingSpot:parkingSpots){
            if (parkingSpot.isAvailiable()){
                return false;
            }
        }
        return true;
    }



}
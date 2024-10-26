package SystemDesign.ParkingLot.Classes;

import java.util.ArrayList;
import java.util.List;

public class ParkingALot {

    private String name;

    private String address;

    private  List<Floor> floors;


    public ParkingALot( String name, String address) {
        this.name = name;
        this.address = address;
        this.floors=new ArrayList<>();
    }

    void addFloor(Floor floor){
        this.floors.add(floor);
    }

    List<Floor> getFloor(){
        return this.floors;
    }

    boolean isFull(){
        for (Floor floor:floors){

            if (floor.isAvailiable()){
                return true;
            }
        }
        return false;

    }






}

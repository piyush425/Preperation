package SystemDesign.ParkingLot.Classes;

public class ParkingSpot {

    private boolean isAvailiable;

    public ParkingSpot(String spotType) {
        this.spotType = spotType;
        this.isAvailiable=true;
    }

    @Override
    public String toString() {
        return "ParkingSpot{" +
                "isAvailiable=" + isAvailiable +
                ", spotType='" + spotType + '\'' +
                '}';
    }

    public void occupySpot() {
        this.isAvailiable = false;
    }

    public void freeSpot() {
        this.isAvailiable = true;
    }

    private String spotType;

    public boolean isAvailiable() {
        return isAvailiable;
    }

    public void setFull(boolean full) {
        isAvailiable = full;
    }

    public String getSpotType() {
        return spotType;
    }




}

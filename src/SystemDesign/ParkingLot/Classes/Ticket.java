package SystemDesign.ParkingLot.Classes;

import java.time.LocalDateTime;

public class Ticket {

    private Vehicle vehicle;
    private ParkingSpot spot;
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;
    private boolean isPaid;
    private double amountPaid;

    public Ticket(Vehicle vehicle, ParkingSpot spot) {
        this.vehicle = vehicle;
        this.spot = spot;
        this.entryTime=LocalDateTime.now();
        this.isPaid=false;
    }
    public void setExitTime() {
        this.exitTime = LocalDateTime.now();
    }

    public boolean isPaid() {
        return isPaid;
    }
    public void pay(double amount){
        this.amountPaid=amount;
        this.isPaid=true;
    }

    public double calculateParkingFee() {

        long hoursParked = java.time.Duration.between(entryTime, exitTime).toHours();
        double fee = 0;
        if (hoursParked <= 1) {
            fee = 4.0;
        } else if (hoursParked <= 3) {
            fee = 4.0 + (hoursParked - 1) * 3.5;
        } else {
            fee = 4.0 + 2 * 3.5 + (hoursParked - 3) * 2.5;
        }
        return fee;
    }
}

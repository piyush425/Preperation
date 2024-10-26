package SystemDesign.ParkingLot.Classes;

public class Payment {

    private Ticket ticket;
    private String paymentType; // Cash or Credit Card
    private double amount;

    public Payment(Ticket ticket, String paymentType, double amount) {
        this.ticket = ticket;
        this.paymentType = paymentType;
        this.amount = amount;
    }

    public void processPayment() {
        ticket.pay(amount);
    }
}

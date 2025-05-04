package DesignPattern.Structural.FacadePatternV2;

class HotelFacade {

    private BookingSystem booking;
    private PaymentSystem payment;
    private NotificationSystem notification;

    public HotelFacade() {
        booking = new BookingSystem();
        payment = new PaymentSystem();
        notification = new NotificationSystem();
    }

    public void bookHotelRoom() {
        booking.bookRoom();
        payment.processPayment();
        notification.sendConfirmation();
    }
}

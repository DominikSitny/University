package Ue2_Flight;
public class FlightBooking {
    private String flightNumber;
    private String passengerName;
    private double amountPaid;
    private PaymentProcessor paymentProcessor;
    private FlightBookingService bookingService;
    
    public FlightBooking(String flightNumber, String passengerName, double amountPaid) {
        this.flightNumber = flightNumber;
        this.passengerName = passengerName;
        this.amountPaid = amountPaid;
        
        this.paymentProcessor = new PaymentProcessor();
        this.bookingService = new FlightBookingService();
    }
    
    public void processBooking() {
        paymentProcessor.processPayment(amountPaid);
        bookingService.bookFlight(flightNumber, passengerName);
        System.out.println("Booking confirmed for " + passengerName + " on flight " + flightNumber);
    }

    public void cancelBooking() {
        System.out.println("Booking cancelled for " + passengerName + " on flight " + flightNumber);
    }
}

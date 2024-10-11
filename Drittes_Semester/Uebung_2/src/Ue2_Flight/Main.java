package Ue2_Flight;
public class Main {
    public static void main(String[] args) {
        FlightBooking booking = new FlightBooking("AF123", "John Doe", 500.0);
        
        booking.processBooking();
        
        booking.cancelBooking();
    }
}

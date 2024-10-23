package de.DominikSitny.FlightV2;

public class FlightBookingService implements IFlightBookService{
	
	FlightBooking fb;
	
	public FlightBookingService(FlightBooking fb) {
		this.fb = fb;
	}
	
	public void bookFlight(String flightNumber, String passengerName) {
        System.out.println("Booking flight " + flightNumber + " for passenger " + passengerName);
    }
	public void processBooking(IPaymentProcessor paymentProcessor) {
        paymentProcessor.processPayment(fb.getAmountPaid());
        bookFlight(fb.getFlightNumber(), fb.getPassengerName());
        System.out.println("Booking confirmed for " + fb.getPassengerName() + " on flight " + fb.getFlightNumber());
    }

    public void cancelBooking() {
        System.out.println("Booking cancelled for " + fb.getPassengerName() + " on flight " + fb.getFlightNumber());
    }
}

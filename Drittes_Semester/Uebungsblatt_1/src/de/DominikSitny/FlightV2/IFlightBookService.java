package de.DominikSitny.FlightV2;

public interface IFlightBookService {

	public void bookFlight(String flightNumber, String passengerName);
	public void processBooking(IPaymentProcessor paymentProcessor);
	public void cancelBooking();
	
	
}

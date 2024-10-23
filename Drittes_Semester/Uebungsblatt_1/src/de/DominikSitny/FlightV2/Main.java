package de.DominikSitny.FlightV2;


public class Main {
	
	  public static void main(String[] args) {
		  
		  FlightBooking fb = new FlightBooking("AF123", "John Doe", 500.0);
		  IFlightBookService fbs = new FlightBookingService(fb);
		  fbs.processBooking(new PaymentProcessor());
		  fbs.cancelBooking();
	  }

}

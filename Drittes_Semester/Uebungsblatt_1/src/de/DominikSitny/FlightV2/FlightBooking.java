package de.DominikSitny.FlightV2;

public class FlightBooking {

	 private String flightNumber;
	    private String passengerName;
	    private double amountPaid;
	    
	    public FlightBooking(String flightNumber, String passengerName, double amountPaid) {
	        this.flightNumber = flightNumber;
	        this.passengerName = passengerName;
	        this.amountPaid = amountPaid;
	        

	    }

		public String getFlightNumber() {
			return flightNumber;
		}

		public void setFlightNumber(String flightNumber) {
			this.flightNumber = flightNumber;
		}

		public String getPassengerName() {
			return passengerName;
		}

		public void setPassengerName(String passengerName) {
			this.passengerName = passengerName;
		}

		public double getAmountPaid() {
			return amountPaid;
		}

		public void setAmountPaid(double amountPaid) {
			this.amountPaid = amountPaid;
		}

	
}

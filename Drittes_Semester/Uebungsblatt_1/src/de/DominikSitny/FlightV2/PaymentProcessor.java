package de.DominikSitny.FlightV2;

public class PaymentProcessor implements IPaymentProcessor{
	public void processPayment(double amount) {
        System.out.println("Processing payment of $" + amount);
    }
}

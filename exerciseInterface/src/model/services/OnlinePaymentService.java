package model.services;

public interface OnlinePaymentService {
	
	double paymentFee(double amount);
	double interests(double amount, int months);

}

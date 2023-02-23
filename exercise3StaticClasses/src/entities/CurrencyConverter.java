package entities;

public class CurrencyConverter {
	
	public static double dollarprice;
	public static double dollars;
	
	public static double amountToPay() {
		double conta = (dollarprice * dollars) * 6 / 100;
		return dollarprice * dollars + conta;
	}
	
	
	

}

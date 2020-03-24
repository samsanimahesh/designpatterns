package strategy;

import java.util.Scanner;

public class StrategyDemo {
	public static void main(String[] args) {
		System.out.println("Enter payment strategy");
		Scanner scanner = new Scanner(System.in);
		String strategy = scanner.nextLine();
		PayStrategy paymentStrategy = null;
		if(strategy.equals("credit")){
			paymentStrategy = new CreditCardPaymentStrategy();
		}else{
			paymentStrategy = new PaypalPaymentStrategy();
		}
		paymentStrategy.collectPaymentDetails();
		boolean paid = paymentStrategy.pay(1000);
		if(paid){
			System.out.println("Payment successful");
		}else{
			System.out.println("Payment not success");
		}
	}

}

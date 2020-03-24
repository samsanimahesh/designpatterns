package strategy;

import java.util.Scanner;


public class CreditCardPaymentStrategy implements PayStrategy{
	boolean isCardValid;

	@Override
	public boolean pay(int paymentAmount) {
		if(isCardValid){
			return true;
		}
		System.out.println("card is invalid");
		return false;
	}

	@Override
	public void collectPaymentDetails() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the card number: ");
        String number = scanner.nextLine();
        System.out.print("Enter the card expiration date 'mm/yy': ");
        String date = scanner.nextLine();
        System.out.print("Enter the CVV code: ");
        String cvv = scanner.nextLine();
        validateCreditCard(number, cvv);
	}

	private void validateCreditCard(String number, String cvv) {
		if(number.length()!= 16 && cvv.length() != 3){
			isCardValid = false;
		} else{
			isCardValid = true;
		}
		
		
	}

}

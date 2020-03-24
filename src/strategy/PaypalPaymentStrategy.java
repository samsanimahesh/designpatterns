package strategy;

import java.util.Scanner;

public class PaypalPaymentStrategy implements PayStrategy{

	boolean isUserValid;
	@Override
	public boolean pay(int paymentAmount) {
		if(isUserValid){
			return true;
		}
		System.out.println("UserName is invalid");
		return false;
	}

	@Override
	public void collectPaymentDetails() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter username");
		String userName = scanner.nextLine();
		System.out.println("\n Enter Password");
		String password = scanner.nextLine();
		validateUser(userName, password);
		
	}

	private void validateUser(String userName, String password) {
		if(userName.equals("admin") && password.equals("adminPwd")){
			isUserValid = true;
		}else{
			isUserValid = false;
		}
		
	}

}

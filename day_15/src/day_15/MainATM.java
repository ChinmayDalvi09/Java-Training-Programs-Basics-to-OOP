package day_15;

import java.util.Scanner;

public class MainATM {
	public static void main(String[] args) {
		System.out.println("ATM Abstraction using Type Casting(implicit)");
		System.out.println("--------------------------------------------");
		kotakATM ka=new kotakATM();
		Scanner sc =new Scanner(System.in);
		for(;;) {
			System.out.println("1.withdraw 2.Add cash 3.Check Balance");
			int ch =sc.nextInt();
		System.out.println("enter pin here:");
		int epin=sc.nextInt();
		
		if(epin==ka.pass) {
			System.out.println("Correct pin");
			switch(ch) {
			case 1:
				System.out.println("enter amount to withdraw");
				int withdraw=sc.nextInt();
				ka.withdraw(withdraw);
				break;
			case 2:
				System.out.println("enter amount to Deposite");
				int deposite=sc.nextInt();
				ka.addbalance(deposite);
				break;
			case 3:
				ka.checkbalance();
				break;
			default:
				System.out.println("enter valid choice");
			}
		
		}
		else {
			System.out.println("incorrect pin");
		}
		
			
		}
	}


}

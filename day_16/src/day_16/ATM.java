
//interface for multiple inheritance
package day_16;

import java.util.Scanner;

interface SBI_ATM{
	//int balance=100;
	//int pass=123;
	void withdraw(int amount);
	void Chekbalance();
}

interface BOI_ATM{
	
	void Addbalance(int amount);
	void Chekbalance();
}



class BothAtm implements SBI_ATM,BOI_ATM {
     int balance=0;
    
	@Override
	public void Addbalance(int amount) {
		// TODO Auto-generated method stub
		balance+=amount;
		System.out.println("current balance is: "+balance);
		
	}

	@Override
	public void withdraw(int amount) {
		// TODO Auto-generated method stub
		if(amount<=balance) {
			balance-=amount;
			System.out.println(amount+" withdraw done");
		}
		else {
			System.out.println("Insufficient balance");
		}
		
	}

	@Override
	public void Chekbalance() {
		// TODO Auto-generated method stub
		System.out.println("current balance is: "+balance);
		
	}
	
}



public class ATM  {
	public static void main(String[] args) {
		System.out.println("multiple inheritance using interface");
		System.out.println("------------------------------------");
		int pass=123;
		BothAtm ba = new BothAtm();
		ATM a= new ATM();
		Scanner sc = new Scanner(System.in);
		for(;;) {
			System.out.println("1.withdraw 2.Add cash 3.Check Balance");
			int ch =sc.nextInt();
			System.out.println("enter pin here:");
			int epin=sc.nextInt();
			if(epin==pass) {
				System.out.println("correct pin");
				switch(ch) {
				case 1:
					System.out.println("enter amount to withdraw");
					int w=sc.nextInt();
					ba.withdraw(w);
					break;
				case 2:
					System.out.println("enter ammount to deposite");
					int d=sc.nextInt();
					ba.Addbalance(d);
					break;
				case 3:
					System.out.println("check balance");
					ba.Chekbalance();
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

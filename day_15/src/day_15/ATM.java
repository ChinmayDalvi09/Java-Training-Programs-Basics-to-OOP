package day_15;

abstract public class ATM {
	double balance=0;
	static int pass=1234;
	static String user="Chinmay";
	abstract void withdraw(double amount);
	abstract void addbalance(double amount);
	abstract void checkbalance();

}
class kotakATM extends ATM{

	@Override
	void withdraw(double amount) {
		if(amount<=balance) {
			balance-=amount;
			System.out.println(amount+" withdraw done");
		}
		else {
			System.out.println("Insufficient balance");
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	void addbalance(double amount) {
		balance+=amount;
		System.out.println(amount+" Rs added..!");
		// TODO Auto-generated method stub
		
	}

	@Override
	void checkbalance() {
		System.out.println("current balance is: "+balance);
		// TODO Auto-generated method stub
		
	}
	
}

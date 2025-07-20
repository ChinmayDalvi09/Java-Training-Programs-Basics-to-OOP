
//Method over-rinding(runtime poly)
package day_13;

public class Bank {
	int balance=100;
	void display() {
		System.out.println("Account balance is: "+balance);
	}

}

class HDFC extends Bank{
	int balance=200;
	//over-riding
	void display() {
		System.out.println("HDFC balance is: "+balance);
	}
	
}

class SBI extends Bank{
	int balance=300;
	//over-riding
	void display() {
		System.out.println("SBI balance is: "+balance);
	}
	
}

class RBI extends Bank{
	int balance=400;
	//over-riding
	
	
	
	
	
	
	
	
	
	void display() {
		System.out.println("RBI balance is: "+balance);
	}
	
}

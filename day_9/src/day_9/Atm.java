package day_9;

import java.util.Scanner;

public class Atm {
	private int id=1234;
	private String pass="Tan@123";
	double balance=1000;
	void setid(int id) {
		this.id=id;
	}
	void setpass(String p) {
		this.pass=p;
	}
	int getid() {
		return id;
	}
	String getpass() {
		return pass;
	}
	double showb() {
		return balance;
	}
	void deposite(double amt) {
		this.balance+=amt;
	}
	void wid(double amt) {
		if (amt>balance) {
			System.out.println("Invalid Balance !");
		}
		else
		this.balance-=amt;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Id");
		int i=sc.nextInt();
		System.out.println("Enter Password");
		String p=sc.next();
		Atm a=new Atm();
		if(i==a.id&& p.equals(a.pass)) {
			while (true) {
		System.out.println("Press 1 to Add: 2 to Withdrawl: 3 to Check Balance: 4 exit");
		int c=sc.nextInt();
		switch (c) {
		case 1: {
			System.out.println("Enter Amount");
			Double m=sc.nextDouble();
			a.deposite(m);
			System.out.println("Done");
			break;
		}
		case 2: {
			System.out.println("Enter Amount");
			Double x=sc.nextDouble();
			a.wid(x);
			System.out.println("Done");
			break;
		}
		case 3: {
			System.out.println("Available Amount");
			System.out.println(a.showb());
			break;
			
		}
		case 4: {
			System.exit(0);
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + c);
		}
		}
		}
		}
		
	}

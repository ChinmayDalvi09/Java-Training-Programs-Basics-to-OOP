package day_12;

import java.util.Scanner;

public class Bag {
	String brand;
	int price;
	Laptop l;
    
	Bag(String brand, int price){
		this.brand=brand;
		this.price=price;
	}
	
	void addLaptop() {
		if(l==null) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter laptop name");
			String name=sc.next();
			System.out.println("enter laptop price");
			int price=sc.nextInt();
			 l=new Laptop(name, price);
			System.out.println("laptop added");
		}
		else {
			System.out.println("bag is null");
		}
		
	}
	void removeLaptop() {
		if(l==null) {
			System.out.println("bag is empty add laptop");
		}
		else {
			l=null;
			System.out.println("laptop removed");
		}
	}
	
	void display() {
		if(l==null) {
			System.out.println("bag is empty add laptop");
		}
		else {
			System.out.println("laptop name: "+l.name);
			System.out.println("laptop price: "+l.price);
		}
	}
	
	void displayBag() {
		System.out.println("bag brand: "+brand);
		System.out.println("bag price: "+price);
	}
}

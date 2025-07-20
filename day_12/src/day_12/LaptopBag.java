package day_12;

import java.util.Scanner;

public class LaptopBag {
	public static void main(String[] args) {
		Bag b1=new Bag("sky bag",4500);
		for(;;) {
			Scanner sc= new Scanner(System.in);
			System.out.println("1. add, 2. remove, 3. display laptop, 4. display bag");
			int a = sc.nextInt();
			switch(a) {
			case 1:
				b1.addLaptop();
				break;
			case 2:
				b1.removeLaptop();
				break;
			case 3:
				b1.display();
				break;
			case 4:
				b1.displayBag();
				break;
			default:
				System.out.println("enter valid choice");
			}
		}
	}

}

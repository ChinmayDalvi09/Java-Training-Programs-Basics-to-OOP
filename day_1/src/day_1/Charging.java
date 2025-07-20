package day_1;
import java.util.Scanner;

public class Charging {
	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter your battery percentage:");
		   int per = sc.nextInt();
		   
		   if(per<=20) {
			   System.out.println("Connect charger");
		   }
		   else {
			   System.out.println("no need to connect charger");
	       }
		   sc.close();
	}
	}


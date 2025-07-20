package day_1;
import java.util.Scanner;
public class PrimeNum {
	
		static boolean isPrime(int num) {
			for(int i=2;i<num;i++)
				if(num % i == 0)
					return false;
			return true;					
		}
		
		
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter number here:");
			int num = sc.nextInt();
			if(isPrime(num)) {
				System.out.println("prime number");
			}
			else {
				System.out.println("not prime number");
			}
			
				
		}


}

package day_3;
import java.util.Scanner;

public class AmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number Here:");
		int num = sc.nextInt();
		int n=num;
		int cube=0;
		int sum=0;	
		
		
		
		while(num!=0) {
		
		for(int i=0;i<=num;i++) {
			 int last = num%10;
			// System.out.println(last);
			cube=last*last*last;
			
		}
		num=num/10;
		sum=sum+cube;
		
		}
		System.out.println(sum);
		if(sum==n) {
			System.out.println("armstrong");
		}
		else {
			System.out.println("not");
		}
	}

}

package day_1;
import java.util.Scanner;
public class Reverse {
	public static void main(String[] args) {
		int rev=0;
		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		while(num!=0) {
			int r= num%10;
			rev=(rev * 10)+r;
			num=num/10;
		}
		System.out.println("reverse of number is: "+ rev);
	}


}

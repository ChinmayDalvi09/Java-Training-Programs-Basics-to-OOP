package day_3;
import java.util.Scanner;

public class Spy_Num {
	public static void main(String[] args) {
		int msum=1;
		int asum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		while (num!=0) {
			int last=num%10;
			msum=msum*last;
			asum=asum+last;
			num=num/10;
		}
		System.out.println(msum);
		System.out.println(asum);
		if(asum==msum) {
			System.out.println("spy number");
		
		}
		else {
			System.out.println("not spy number");
		}
	}

}
package day_3;

import java.util.Scanner;

public class Strong_Num 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num= sc.nextInt();
		int OriNum=num;
		int sum=0;
		while(num>0) 
		{
			int last=num%10;
			int fact=1;
			for(int i=1;i<=last;i++) 
			{
				fact=fact*i;
			}
			sum=sum+fact;
			num=num/10;
		}
		if(sum==OriNum) 
		  {
			System.out.println("strong number");
		  }
		else 
		  {
			System.out.println("not strong number");
		  }
	}

}


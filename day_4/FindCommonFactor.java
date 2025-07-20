
import java.util.Scanner;

public class FindCommonFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st number:");
        int num1=sc.nextInt();

        System.out.println("enter 2nd number:");
        int num2=sc.nextInt();

        int min= Math.min(num1, num2);
        for(int i=1;i<=min;i++){
            if(num1%i==0 && num2%i==0){
                System.out.println(i);
            }
        }
    }
    
}

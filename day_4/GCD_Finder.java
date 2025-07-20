
import java.util.Scanner;

public class GCD_Finder {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter 1st number: ");
        int a=sc.nextInt();

        System.out.println("enter 2nd number: ");
        int b=sc.nextInt();

        int g=0;
        for (int i = 1; i <=a; i++) {
            if(a%i==0 && b%i==0){
                g=i;
            }
            
        }
        System.out.println("GCD of given number is: "+ g);
    }
}

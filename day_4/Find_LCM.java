
import java.util.Scanner;

public class Find_LCM {
    public static int findGCD(int a, int b){
        int g=0;
        for(int i=1;i<=a;i++){
            if(a%i==0 && b%i==0){
                g=i;
            }
        }
        return g;
    }

    public static int FindLCM(int a, int b){
        return (a*b)/findGCD(a, b);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter 1st number: ");
        int num1=sc.nextInt();

        System.out.println("enter 2nd number: ");
        int num2= sc.nextInt();

        int lcm= FindLCM(num1, num2);

        System.out.println("LCM of "+num1+" and "+num2+" is: "+lcm);
    }
}

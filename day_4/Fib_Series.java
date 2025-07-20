
import java.util.Scanner;

public class Fib_Series{
    public static void fib(int n){
        int n1=0, n2=1;
        for (int i = 0; i < n; i++) {
            System.out.print(n1+ " ");
            int n3=n1+n2;
            n1=n2;
            n2=n3;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n value: ");
        int n=sc.nextInt();
        fib(n);
    }
}
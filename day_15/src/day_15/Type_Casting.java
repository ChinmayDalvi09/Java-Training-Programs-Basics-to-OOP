package day_15;

public class Type_Casting {
	public static void main(String[] args) {
		//implicit type casting
		int a=500;
		long b=a;  //implicitly type-cast
		float c=b; //implicitly type-cast
		double d=c; //implicitly type-cast
		System.out.println("int val "+a);
		System.out.println("long val "+b);
		System.out.println("float val "+c);
		System.out.println("double val "+c);
		char s='c';
		int f=s;
		System.out.println(f);
		
		int r=65;
		char m=(char)r;  //Explicit type-casting
		System.out.println(m);
		long lval=545466564;
		float fval=(float)lval;
		double dval=(double)lval;
		System.out.println(fval);
		System.out.println(dval);
	}

}

package day_8;

public class NonStatic {
	//constructor overloading
	NonStatic(){
		System.out.println("constructor overloading");
	}
	NonStatic(int a, int b){
		System.out.println("addition is: "+ (a+b));
	}
	NonStatic(float a, int b){
		System.out.println("substraction is: "+ (a-b));
	}
	NonStatic(int a, int b, int c){
		System.out.println("multiplication is: "+(a*b*c));
	}
	
	public static void main(String[] args) {
		NonStatic ns = new NonStatic();
		NonStatic ns1 = new NonStatic(2,3);
		NonStatic ns3 = new NonStatic(2.5f,3);
		NonStatic ns2 = new NonStatic(3,2,1);
				
	}

}

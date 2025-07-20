package day_13;
class Parent{
	void display() {
		String name="Pratap";
		int age= 63;
		System.out.println("parent name: "+name);
		System.out.println("parent age: "+ age);
	}
}

class Child extends Parent{
	String name="Chinmay";
	int age=21;
	void display2() {
		System.out.println("child name: "+name);
		System.out.println("child age: "+age);
	}
}

public class SingleLevelInheritance {
	public static void main(String[] args) {
		Child c=new Child();
		c.display();
		System.out.println("-------------------------------------");
		c.display2();
	}

}

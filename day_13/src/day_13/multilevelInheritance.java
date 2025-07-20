package day_13;

class Animal{
	void display1() {
		System.out.println("there is differenrt animals");
	}
}

class Dog extends Animal{
	void display2() {
		System.out.println("Dog's sound is: Bhaw Bhaw");
	}
}

class Cat extends Dog{
	void display3() {
		System.out.println("Cat's Sound is: Mew Mew");
	}
}
public class multilevelInheritance {
	public static void main(String[] args) {
		Cat c= new Cat();
		c.display1();
		System.out.println("-------------------------------------");
		c.display2();
		System.out.println("-------------------------------------");
		c.display3();
	}

}

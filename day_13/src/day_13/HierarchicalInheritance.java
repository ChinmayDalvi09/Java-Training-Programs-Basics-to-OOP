package day_13;
class Animal1{
	void eat() {
		System.out.println("this animal eats hybrid food");
	}
}

class Dog1 extends Animal1{
	void bark() {
		System.out.println("Dog barks");
	}
}

class Cat1 extends Animal1{
	void meow() {
		System.out.println("cat meows");
	}
}

public class HierarchicalInheritance {
	public static void main(String[] args) {
		Dog1 d = new Dog1();
		d.bark();
		d.eat();
		System.out.println("-------------------------------------");
		Cat1 c = new Cat1();
		c.meow();
		c.eat();
	}

}

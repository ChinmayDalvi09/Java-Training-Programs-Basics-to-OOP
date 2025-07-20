package day_15;

interface Interface_Dog {
	void Sound();
	void Eat();
}

interface interface_Cat{
	void Sound();
	void Eat();
	void Height();
}

class Animal2 implements Interface_Dog,interface_Cat{
	@Override
	public void Sound() {
		System.out.println("Dog barks");
		System.out.println("CAT Meow meow");
	}
	@Override
	public void Eat() {
		System.out.println("Dog and cat both eat food veg as well as non-veg");
	}

	public void Height() {
		System.out.println("cats height is 1'2");
	}
}


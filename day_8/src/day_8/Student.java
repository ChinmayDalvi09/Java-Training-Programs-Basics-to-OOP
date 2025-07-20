package day_8;
//normal constructor
public class Student {
	String name;
	int roll;
	int yop;

	public Student(String name, int roll, int passyear) {
		this.name=name;
		this.roll=roll;
		this.yop=passyear;
	}
	public static void main(String[] args) {
		Student s1= new Student("chinmay", 13130,2026);
		System.out.println("student details");
		System.out.println("name "+s1.name);
		System.out.println("roll no "+s1.roll);
		System.out.println("Pass year "+s1.yop);
	}
}

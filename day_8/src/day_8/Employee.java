package day_8;

//normal constructor program

public class Employee {
	String name;
	int eid;
	int sal;
	String dep;

	public Employee(String name, int eid, int sal, String dep) {
		this.name=name;
		this.eid=eid;
		this.sal=sal;
		this.dep=dep;
	}
	public static void main(String[] args) {
		Employee s1= new Employee("chinmay", 13130,25026,"IT");
		System.out.println("student details");
		System.out.println("name "+s1.name);
		System.out.println("employee id "+s1.eid);
		System.out.println("salary "+s1.sal);
		System.out.println("department is "+s1.dep);
	}
}



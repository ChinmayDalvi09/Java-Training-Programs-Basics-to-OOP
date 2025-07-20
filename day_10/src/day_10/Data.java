package day_10;

public class Data {
	int id;
	Student s;
	public void display(int id, Student s) {
		System.out.println("id:"+id);
		System.out.println("name:"+s.name);
	}
	public static void main(String[] args) {
		Data d=new Data();
		Student s= new Student("Chinmay");
		d.id=13130;
		d.display(d.id, s);
	}
}

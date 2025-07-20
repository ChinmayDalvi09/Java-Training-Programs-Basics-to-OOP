package day_8;
//this is main method which access Car class and run that class here
public class CarMain {
	public static void main(String[] args) {
		Car c1=new Car("Fronx","sigma",1000000,"MS");
		Car c2=new Car("punch","delta",1200000,"tata");
		Car c3=new Car("Venue","Beta",1400000,"Hyundai");
		c1.display();
		c2.display();
		c3.display();
	}

}

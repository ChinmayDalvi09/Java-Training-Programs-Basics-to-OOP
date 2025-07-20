package day_11;

public class EngineBike {
	public static void main(String[] args) {
		Bike B1= new Bike("unicorn",116000);
		B1.E.DisplayEngine();
		B1.DisplayBike();
		
		Bike B2 = new Bike("Hornet",130000);
		B2.E.DisplayEngine();
		B2.DisplayBike();
	}

}

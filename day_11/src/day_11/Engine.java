//early binding (composition)

package day_11;

public class Engine {
	String brand;
	int cc;
	public Engine(String brand, int cc) {
		this.brand=brand;
		this.cc=cc;
		 System.out.println("------------------");
		System.out.println("engine is created");
		 System.out.println();
	}
	void DisplayEngine() {
		System.out.println("engine brand: "+ brand);
	    System.out.println("engine cc: "+cc);
	}

}

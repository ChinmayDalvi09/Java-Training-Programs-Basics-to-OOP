package day_11;

public class Bike {
	String name;
	int price;
	Engine E=new Engine("Honda", 160);  //early binding or composition
	
   public Bike(String name, int price) {
	   this.name=name;
	   this.price=price;
	   System.out.println("bike created");
	  System.out.println();
   }
   
   public void DisplayBike() {
	   System.out.println("bike name: "+name);
	   System.out.println("bike price: "+price);
   }

}

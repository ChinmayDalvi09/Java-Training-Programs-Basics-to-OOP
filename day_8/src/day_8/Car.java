package day_8;

//making constructor in this class and accessing it from another class

public class Car {
    String name;
    String model;
    double price;
    String company;
    Car(String name,String model,double price,String company){
    	this.name=name;
    	this.model=model;
    	this.price=price;
    	this.company=company;
    }
    void display() {
    	System.out.println("car name:" +name);
    	System.out.println("car model:"+ model);
    	System.out.println("car price:"+price);
    	System.out.println("car company:"+company);
    	System.out.println("---------------------");
    }
}

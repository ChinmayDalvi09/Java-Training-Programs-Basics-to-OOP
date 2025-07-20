package day_8;

public class RegForm {
	String name;
	int roll;
	int UID;
	
	RegForm(){
		
	}
	RegForm(String name, int roll){
		this.name=name;
		this.roll=roll;
		System.out.println(name+"\n"+roll);
	}
	RegForm(String name, int roll, int UID){
		this.name=name;
		this.roll=roll;
		this.UID=UID;
		System.out.println(name+"\n"+roll+"\n"+UID);
	}
	public static void main(String[] args) {
		RegForm rf=new RegForm("chinmay",13130,123);
		RegForm rf1=new RegForm("chinmay",13130,123);
		
	}

}

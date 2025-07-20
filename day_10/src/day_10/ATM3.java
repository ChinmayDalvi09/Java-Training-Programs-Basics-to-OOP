package day_10;

public class ATM3 {
	double bal;
	User u;
	void checkbalance(double bal, User u) {
		System.out.println("delhi branch");
		System.out.println("user name:"+ u.name);
		System.out.println("Current Balance:"+bal);
	}
	public static void main(String[] args) {
		ATM3 a= new ATM3();
		User u= new User("Chinmay",13130);
		a.bal=50088;
		if(u.pass==13130) {
			a.checkbalance(a.bal, u);
		}
		else {
			System.out.println("please check passward");
		}
	}

}

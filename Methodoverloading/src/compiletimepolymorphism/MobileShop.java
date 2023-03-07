package compiletimepolymorphism;

public class MobileShop {
	
	public void mobile(char c) {
		System.out.println("Show Brand Series: " +c);
	}
	
	public void mobile(int num) {
		System.out.println("Mobile Internal Memory: " +num);
	}
	
	public void mobile(String Specific) {
		System.out.println("1.Mobile Specification: " +Specific);
	}
	public void mobile(float h) {
		System.out.println("Highest Rating: " +h);
	}
	public void mobile(double j) {
		System.out.println("Lowest Rating: " +j);
	}
	public void mobile(boolean k) {
		System.out.println("Condition: " +k);
}				
	public void mobile(char a, int l) {
		System.out.println("2.Types: " +a +l);
	}
	
	public static void main(String[] args) {
		MobileShop mo = new MobileShop();
		mo.mobile('A');
		mo.mobile(64);
		mo.mobile("Samsung, 64GB internal memory, 4GB ram, Black Color");
		mo.mobile(5);
		mo.mobile(0.1);
		mo.mobile(true);
		mo.mobile('A', 3);
	}
}	

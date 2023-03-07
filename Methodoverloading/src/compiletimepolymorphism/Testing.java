package compiletimepolymorphism;
//runtime polymorphism(Overriding)
public class Testing extends MobileShop{
	
	 @Override
	public void mobile(char a, int num) {
		 System.out.println("Mobile Model Number: "+a +num);
		 
		 super.mobile(a, num);
	 }
	 
	 @Override
	 public void mobile(String Specific) {
		 System.out.println("Specific: " +Specific);
		
		 super.mobile(Specific);
	 }
	 
	 public static void main(String[] args) {
		 Testing i = new Testing();
		 i.mobile('S', 6);
		 i.mobile("Nokia");
	 }
	
}

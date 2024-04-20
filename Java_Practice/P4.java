class Mobile{
	String brand;
	int price;
	static String name;
	
	static{
		name="Phone";   //static variable should be initialized once so we use static block as it will be executed once
		System.out.println("In Static Block");
	}
	
	public Mobile(){
		brand="";
		price=200;
		System.out.println("In Constructor");
	}
	
	public void show(){
		System.out.println(brand+":"+price+":"+name);
	}
}
	
public class Dem{
	public static void main(String ...args){
			Mobile obj1=new Mobile();
			obj1.brand="Apple";
			obj1.price=1500;
			Mobile.name="SmartPhone";
			Mobile obj2=new Mobile();
	}	
}

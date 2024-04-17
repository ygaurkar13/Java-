class Work{
	String brand;
	int price;
	static String name;
	
	static{
		name="Phone";   //static variable should be initialized once so we use static block as it will be executed once
		System.out.println("In Static Block");
	}
	
	public Work(){
		brand="";
		price=200;
		System.out.println("In Constructor");
	}
	
	public void show(){
		System.out.println(brand+":"+price+":"+name);
	}
}
	
public class P5{
	public static void main(String ...args)throws ClassNotFoundException{
		Class.forName(className:"Work");	
	}	
}

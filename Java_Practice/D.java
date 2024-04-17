interface A{
	void run();
	void stretch();
}
interface B{
	void rest();
	void bathColdWater();
}
abstract class C implements A,B{
	public void run(){
		System.out.println("Go for a Run Daily!!");
	}
	public void stretch(){
		System.out.println("Do stretching before a run.");
	}
	public void rest(){
		System.out.println("Take proper rest.");
	}
	
	
}
class D extends C{
	public void bathColdWater(){
		System.out.println("After a run bath with cold water.");
	}
	public static void main(String ...args){
		C obj=new D();
		
		obj.stretch();
		obj.run();
		obj.bathColdWater();
		obj.rest();
	}
}




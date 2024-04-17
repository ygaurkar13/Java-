class Human{
	private int age =12;
	private String name="Sam";
	
	public Human(){
		System.out.println("In Constructor");
	}
	
	public int getAge(){
		return age;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public void setName(String name){
		this.name=name;
	}
}

public class X{
	public static void main(String ...args){
		Human boy=new Human();
		Human boy1=new Human();
		boy.setAge(13);
		boy.setName("Sam");
		
		System.out.println(boy.getName()+":"+boy.getAge());
	}
}

interface Computer{
	void code();
}

class Desktop implements Computer{
	public void code(){
		System.out.println("Faster:Run Compile code");
	}
}

class Laptop implements Computer{
	public void code(){
		System.out.println("Run Compile code");
	}
}

class Developer{
	public void  devApp(Computer system){
		system.code();
	}
}

public class C2{
	public static void main(String ...args){
		Computer lap=new Laptop();
		Computer desk=new Desktop();
		
		Developer rushi= new Developer();
		rushi.devApp(lap);
		rushi.devApp(desk);
	}
}



class Calculator{
	public int add(int n1,int n2,int n3){
		return n1+n2+n3;
	}
	
	public int add(int n1,int n2){
		return n1+n2;
	}
}

public class Demo{
	public static void main(String ...args){
		Calculate obj=new Calculate();
		int i1=obj.add(2,3,4);
		System.out.println(i1);
	}
}

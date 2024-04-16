public class Practice{
	
	public static void main(String a[]){
		int x=7;
		int y=3;
		int z=6;
		int w=8;
		boolean result= x>y && z>w;
		System.out.println(result);
		
		boolean res= x>y || z>w;
		System.out.println(res);
		
		boolean result3= !(x>y && z>w);
		System.out.println(result3);
	}
}

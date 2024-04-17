import java.util.Scanner;

public class E{
	public static void main(String ...args){
		
		int j=0;
		int i=8;
		int nums[]=new int[5];
		try{
		i=i/j;
		if(j==0){
			throw new ArithmeticException();
		}
		System.out.println(nums[1]);
		System.out.println(nums[5]);
		}
		catch(ArithmeticException e){
			System.out.print("Cannot divide by zero ,j:");
			Scanner sc=new Scanner(System.in);
			j=sc.nextInt();
			i=i/j;
			System.out.println(i);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
		finally{
			System.out.println("::Finally Block::");
			
		}
		
	}
}

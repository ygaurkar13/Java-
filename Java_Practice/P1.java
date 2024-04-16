
import java.util.Scanner;

public class P1{
	public static void main(String[] args){
		String y="You cannot do coding!";
		y=y.toLowerCase();
		y=y.replace(" ","..");
		System.out.println(y);
			String a="I am not intersted in it !";
			a=a.replace("not","");
			System.out.println(a);
			System.out.println("Age ?");
			System.out.println("=");
			Scanner sc= new Scanner(System.in);
		int age=sc.nextInt();
		
		/*
		switch(age){
		case 10:
			System.out.println("To be teen.");
			break;
		case 15:
			System.out.println("You are a teen.");
			break;
		case 21:
			System.out.println("You are an Adult.");
			break;
		default :
			System.out.println("Live It:)");
			}
			*/
			/*
			if(age<=13){
				System.out.println("Live It:)");
				
			}
			else if(age>13&&age<=19){
			System.out.println("Work on one Thing you love to do!");
			
			}
			else if(age>19&&age<=27){
				System.out.println("Enjoy as well ");
			}
			else if(age>27&&age<=60){
				System.out.println("Work");
			}
			else{
				System.out.println("Live to the fullest");
			}
			*/
			int i=0;
				while(i<10){
					System.out.println("ONE");	
					if(i==4){
						System.out.println("one");
						break;
					}
						i++;
				}
					System.out.println("STOP");
				for(i=0;i<=10;i++){
						System.out.println("ONE");	
					if(i==4){
						System.out.println("one");
						break;
					}
						i++;
				}
					System.out.println("STOP");
				
	}
	
}

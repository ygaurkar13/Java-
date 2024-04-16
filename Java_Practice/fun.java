class fun{
	public static void main(String ...args){
		int n=5;
		int result=0;
		result= n%2==0 ? 10: 20;  //ternary optr
		System.out.println(result);
		String out="";
		int n1=1;
		
		switch(n1){
			case 1:System.out.println("Mon");
				break;
			case 2:System.out.println("Mon");
				break;
			case 3:System.out.println("Mon");
				break;
			case 4:System.out.println("Mon");
				break;
			case 5:System.out.println("Mon");
				break;
			case 6:System.out.println("Mon");
				break;
			case 7:System.out.println("Mon");
				break;
		}
		
		String day="Mon";
		switch(day){
			case "Mon":System.out.println("7am");
				break;
			case "Tue":System.out.println("5am");
				break;
			case "Wed":System.out.println("6am");
				break;
			case "Thu":System.out.println("7am");
				break;
			case "Fri":System.out.println("9am");
				break;
			case "Sat":System.out.println("8am");
				break;
			case "Sun":System.out.println("8am");
				break;
		}
		
		
				
		out=switch(day)
		{
			case "Mon"->"7am";
				
			case "Tue"->"5am";
				
			case "Wed"->"6am";
				
			case "Thu"->"7am";
				
			case "Fri"->"9am";
				
			case "Sat"->"8am";
				
			case "Sun"->"8am";
			
			default->"7am";
				
		};
		System.out.println(out);
		
		/* out=switch(day)
		{
			case "Mon": yield "7am";
				
			case "Tue": yield "5am";
				
			case "Wed": yield "6am";
				
			case "Thu": yield "7am";
				
			case "Fri": yield "9am";
				
			case "Sat": yield "8am";
				
			case "Sun": yield "8am";
			
			   default: yield "7am";
				
		};
		*/
	}
}

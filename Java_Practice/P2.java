class Shop{
	public void playMusic(){
		System.out.println("Music Playing");
	}
	
	public String getMeAPen(int cost){
		if(cost >=10)
			return "Pen";
		else
			return "Nothing";
	}
}

class Demo{

	public static void main(String ...args){
		Shop obj=new Shop();
		obj.playMusic();
		String str=obj.getMeAPen(10);
		System.out.println(str);
	}
}

class constDemo{
	constDemo(String str){
		System.out.println(str);
	}
}

class accessPoint{
	public static void main(String[] args){

		constDemo cnst1=new constDemo("C2W");

		constDemo cnst2=new constDemo();
	}
}

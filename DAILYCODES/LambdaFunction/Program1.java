interface Demo{
	void M1();
}

class Outer{
	public static void main(String[] agrs){

		Demo obj=()->{
			System.out.println("In M1-Outer$1");
		};

		obj.M1();
	}
}

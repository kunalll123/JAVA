class Outer{
	static {
		gun();
		System.out.println("In static block");
	}
	static class Inner{
		{
			System.out.println("In instance block");
			 
			}
		void fun(){
			System.out.println("In fun");
			gun();
		}
	}
	static void gun(){
		System.out.println("In gun");
	}
}

class Demo{
	public static void main(String[] args){

		new Outer.Inner().fun();
	}
}

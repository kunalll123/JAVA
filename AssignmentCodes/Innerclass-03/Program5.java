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
			
		}
	}
	static void gun(){
		new Inner().fun();
		System.out.println("In gun");
	}
}

class Demo{
	public static void main(String[] args){

		Outer.gun();
	}
}

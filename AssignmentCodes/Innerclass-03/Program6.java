class Outer{
	
	static class Inner{
		private void fun(){
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

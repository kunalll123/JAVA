class Outer {
	 
	class Inner {
		 
		void fun() {

			System.out.println("Hello World!!");
		}
	}
	public static void main(String[] args){

		Outer.Inner obj=new Outer().new Inner();
		obj.fun();
	}
}

class Outer {

	class Inner {
		final static int x=10;

		void fun(){
			System.out.println(x);
		}
	}
	public static void main(String[] args){

		Outer.Inner obj=new Outer().new Inner().fun();
	}
}

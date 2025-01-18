class Outer{
	int x=10;

	 class Inner1 {
		int y=5;

		class Inner2 {

			void fun() {

				System.out.println(z);
			}
			int z = 6;
		}
	}
}

class Main{
	public static void main(String[] args){
		Outer myOuter=new Outer();
		
		Outer.Inner1.Inner2 myInner=myOuter.new Inner1().new Inner2();

		System.out.println(myOuter.x + myInner.z);
		myInner.fun();
	}
}

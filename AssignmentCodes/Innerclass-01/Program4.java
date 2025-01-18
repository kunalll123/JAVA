class Outer{
	int x=10;

	protected class Inner{
		int y=5;
	}
}

class Main{
	public static void main(String[] args){
		Outer myOuter=new Outer();
		
		Outer.Inner myInner=myOuter.new Inner();

		System.out.println(myInner.y + myOuter.x);
	}
}

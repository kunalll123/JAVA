class Outer{
	static int x=10;
	int y=20;

	static void run(){
		System.out.println("In run");
	}

	void fun(){
		System.out.println("In fun");
	}

	static Inner class{
		Inner(){
			System.out.println(x);
			System.out.println(y);
			runt();
			fun();
		}
	}
	public static void main(String[] args){

	Outer.Inner obj=new Outer.Inner();
	}
}

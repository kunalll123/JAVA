class Outer {
	int x=10;
	void fun() {
		System.out.println(x);
	}
}

class Demo{
	public static void main(String[] agrs){

		Outer obj=new Outer(){

			int x=20;
		};

		obj.fun();
	}
}

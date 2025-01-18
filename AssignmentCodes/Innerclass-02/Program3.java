class Outer {
	void fun() {
		System.out.println("In fun");
	}
}

class Demo{
	public static void main(String[] agrs){

		Outer obj=new Outer(){

			void fun(){
				System.out.println("IN FUN");
			}
		};

		obj.fun();
	}
}

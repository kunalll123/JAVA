class Outer {
	int x=10;
	void fun() {
		System.out.println("Hi..");
	}
}

class Demo{
	public static void main(String[] agrs){

		Outer obj=new Outer(){

			int x=20;
			void fun(){
				System.out.println("Hey..");
				gun();
			}
			void gun(){
				System.out.println("Bye..");
			}
		};

		obj.fun();
	}
}

class A{
	void methodOne(){
		class B{
			void methodTwo(){
				System.out.println("Method Two");
			}
		}
		new B().methodTwo();
		System.out.println("Method One");
	}

	void methodThree(){
		methodOne();
		System.out.println("Method Three");
	}
}

class Demo{
	public static void main(String[] args){

		new A.methodThree();
	}
}

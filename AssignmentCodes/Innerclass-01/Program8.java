class A{
	static{
		System.out.println("In A's static block");
	}
	void methodOne(){
		class B{
			{
				System.out.println("In B's instance block");
			}
			void methodTwo(){

				System.out.println("Method Two");
			}
		}

		new B().methodTwo();
		System.out.println("Method One");
	}

}

class Demo{
	public static void main(String[] args){

		new A().methodOne();
	}
}

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

}

class Demo{
	public static void main(String[] args){

		new A().methodOne();
	}
}

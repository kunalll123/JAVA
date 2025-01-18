class ConstructorDemo{
	ConstructorDemo(){
		System.out.println("In Constructor");
}

	void fun(){
		ConstructorDemo obj=new ConstructorDemo();
		System.out.println(obj);
	}

	public static void main(String[] args){

		ConstructorDemo obj1=new ConstructorDemo();
		ConstructorDemo obj2=new ConstructorDemo();

		System.out.println(obj1);
		System.out.println(obj2);

		obj1.fun();
	}
}

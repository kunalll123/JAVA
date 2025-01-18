class Parent{
	int x=10;
	static int y=20;
	
	static void M1(){
		System.out.println("In Parent-M1");
	}
}

class Child extends Parent{
	int a=20;
	static int b=30;

	static void M1(){
		System.out.println("In Child-M1");
	}
}

class Demo{
	Demo(Parent p){
		System.out.println("In Constructor-Parent");
		Parent.M1();
	}

	Demo(Child c){
		System.out.println("In Constructor-Child");
		Child.M1();
	}

	public static void main(String[] args){

		Demo obj1=new Demo(new Parent());

		Demo obj2=new Demo(new Child());
	}
}

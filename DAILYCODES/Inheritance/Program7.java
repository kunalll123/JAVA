class Parent{
	int x=10;
	int y=20;
	Parent(){
		System.out.println("In Parent-Constructor");
	}

	void fun(){
		System.out.println("In fun");
	}
}

class Child extends Parent{
	int x=30;
	int y=40;
	Child(){
		System.out.println("In Child Constructor");
		System.out.println(x);
		System.out.println(y);
		System.out.println(super.x);
		System.out.println(super.y);
	}

	void run(){
		System.out.println("In run");
	}

	public static void main(String[] args){
		Child obj=new Child();
		obj.fun();
		obj.run();
	}
}


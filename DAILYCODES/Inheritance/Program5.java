class Parent{
	int x=10;
	static int y=20;

	Parent(){
		System.out.println("In Parent Constructor");
	}

	void fun(){
		System.out.println("In fun");
	}

	static void run(){
		System.out.println("In run");
	}
}

class child extends Parent{
	child(){
		System.out.println("In child Constructor");
	}

	public static void main(String[] args){
		child obj=new child();
		System.out.println(obj.x);
		System.out.println(obj.y);
		obj.fun();
		obj.run();
	}
}

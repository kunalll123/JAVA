class Parent{
	int x=10;
	Parent(){
		super();
		System.out.println("In Parent-constructor");
		System.out.println(x);
	}
	
	void fun(){
		System.out.println("In fun-parent");
	}

}

class child extends Parent{
	int x=20;
	child(){
		super();
		System.out.println("In child-constructor");
		System.out.println(x);
		System.out.println(super.x);
	}

	void fun(){
		System.out.println("In fun-child");
		super.fun();
	}
}

class client {
	public static void main(String[] args){
		child obj=new child();
		obj.fun();
               
	}
}




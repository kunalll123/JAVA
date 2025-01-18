class Parent{
	int x=10;
	Parent(){
		super();
		System.out.println("In Parent-constructor");
		System.out.println(x);
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
}

class client {
	public static void main(String[] args){
		child obj=new child();
	}
}


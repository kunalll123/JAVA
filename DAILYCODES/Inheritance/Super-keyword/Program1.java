class Parent{
	Parent(){
		super();
		System.out.println("In Parent-constructor");
	}
}

class child extends Parent{
	child(){
		super();
		System.out.println("In child-constructor");
	}
}

class client {
	public static void main(String[] args){
		child obj=new child();
	}
}

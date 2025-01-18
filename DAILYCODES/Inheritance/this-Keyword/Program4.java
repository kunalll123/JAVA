class Demo{
	int x=10;

	Demo(){
		this(10);
		System.out.println("In No-argument Constructor");
	}

	Demo(int x){
		this(20,30);
		System.out.println("In Para1-constructor");
	}

	Demo(int x,int y){
		this();
		System.out.println("In Pare2-constructor");
	}
	
	public static void main(String[] args){
	Demo obj=new Demo();
	}
}
/*error: recursive constructor invocation
        Demo(){*/

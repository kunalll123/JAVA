class Demo1{
	abstract void fun();
	abstract void gun();
}

class Demo2 extends Demo1{
	void fun(){
		System.out.println("Inside-fun");
	}

	void gun(){
		System.out.println("Inside-gun");
	}
}

class Client{
	public static void fun(String[] args){
		Demo2 obj=new Demo2();
		obj.fun();
		obj.gun();
	}
}

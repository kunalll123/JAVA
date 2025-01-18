class Demo1{
	protected void method1(){

	}
}

class Demo2 extends Demo1{
	protected void method1(){
		System.out.println("In Mehtod-1");
	}

	protected void method2(){
		System.out.println("In Mehtod-2");
	}
}

class Demo3 extends Demo2{
	static {
		Demo3 obj=new Demo3();
		obj.method1();
		obj.method2();
	}
	public static void main(String[] args){

	}
}

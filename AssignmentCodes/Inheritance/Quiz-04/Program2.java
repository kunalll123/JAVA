class Demo1{
	void m1(){
		System.out.println("Method-1 -Demo");
	}
}
class Demo2 extends Demo1{
	void m1(){
		System.out.println("Method-1");
	}

	void m2(){
		System.out.println("Method-2");
	}
}
class Client{
	public static void main(String[] args){

		Demo2 obj=new Demo2();
		obj.m2();
		obj.m1();
	}
}

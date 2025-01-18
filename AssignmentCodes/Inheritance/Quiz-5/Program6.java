class Demo1{
	static void run(){

	}
}

class Demo2 extends Demo1{
	void run1(){
		System.out.println("In run");
	}
}

class Client{
	public static void main(String[] args){

		Demo2 obj=new Demo1();
		obj.run1();
	}
}

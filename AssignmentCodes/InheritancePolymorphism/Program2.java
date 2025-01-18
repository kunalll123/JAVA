class Demo1{
	Demo1(){
		System.out.println("Demo1-Const");
	}
}

class Demo2 extends Demo1{
	Demo2(){
		System.out.println("Demo2-const");
	}
}

class Demo3 extends Demo2{
	Demo3(){
		System.out.println("Demo3-Const");
	}
}

class Client{
	public static void main(String[] args){

		Demo1 obj=new Demo3();
	}
}

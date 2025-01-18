class Demo{
	static void method1(){

	}
}

class Demo1 extends Demo{
	default int method2(){
		return 0;
	}
}

class Demo2 extends Demo1{

}

class Client{
	public static void main(String[] args){
		Demo2 obj=new Demo2();

		obj.method2();
		obj.method1();
	}
}

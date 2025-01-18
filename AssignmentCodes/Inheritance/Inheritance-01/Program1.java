class Demo1{
	protected void dataPrint(){
		System.out.println("Method-dataPrint");
	}
}

class Demo2{
	void methodCall(){
		Demo1 obj=new Demo1();
		obj.dataPrint();
	}
}

class Client{
	public static void main(String[] args){
		Demo2 obj=new Demo2();
		obj.methodCall();
	}
}

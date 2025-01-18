class Demo1{
	static int num=100;
	void printNum(){

		System.out.println("method will print num:"+num);
	}
}

class Demo2 extends Demo1{

	int num=1000;
	void printNum(){
		System.out.println(num);
	}
	public static void main(String[] args){

		Demo1 obj=new Demo2();
		obj.printNum();
	}
}

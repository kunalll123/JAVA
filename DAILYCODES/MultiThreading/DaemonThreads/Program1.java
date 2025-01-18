class Demo{
	Demo(){
		System.out.println("Demo Constructor");
	}

	void fun(){
		System.out.println("In fun");
	}

	public void finalize(){
		System.out.println("In Finalize");
	}
}

class Client{
	public static void main(String[] args)throws InterruptedException{

		System.out.println("Start main");

		Demo obj=new Demo();
		obj.fun();

		obj=null;

		System.gc();
		System.out.println("End Main");
	}
}



class Demo{
	Demo(){
		System.out.println("Demo-Constructor");
	}
}

class Demo1 extends Demo{
	Demo1(){
		System.out.println("Demo1-Constructor");
	}
}

class Main{
	public static void main(String[] args){

		Demo obj=null;
		for(int i=0; i<4; i++)
			obj=new Demo1();
	}
}

class A1{
	private A1(){

	}
}
class A2 extends A1{
	A2(){
		System.out.println("In A2 constructor");
	}
}

class A3{
	public static void main(String[] args){

		A1 obj1=new A1();
		A1 obj2=new A2();
	}
}

class Outer{
	class Inner{

		void fun2(){
			System.out.println("In Fun2-Inner");
		}
	}

	void fun1(){
		System.out.println("In Fun1-Outer");
	}
}

class client{
	public static void main(String[] args){

		Outer.Inner obj=new Outer().new Inner();
		obj.fun1();
		obj.fun2();
	}
}

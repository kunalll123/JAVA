class Outer{
	class Inner{
		void M1(){
			System.out.println("In M1-Inner");
		}
	}

	void M2(){
		System.out.println("In M2-Outer");
	}
}

class client{
	public static void main(String[] args){

		Outer obj=new Outer();
		obj.M2();

		Outer.Inner obj1=obj.new Inner();
		//Outer.Inner obj2=new Outer().new Inner();
		//obj2.M1();
	}
}

class Outer{
	
	int x=10;

	Outer(){
		System.out.println("In Outer-Constructor");
		}
	
	class Inner{
		int x=20;
		Inner(int x){
			System.out.println("In Inner-constructor");
			System.out.println(x);
			System.out.println(this.x);
			System.out.println(Outer.this.x);
			Outer.this.fun();
		}
	}
	void fun(){
		System.out.println("In fun");
		}
	
	public static void main(String[] args){

		Outer obj=new Outer();
		Inner obj1=new Outer().new Inner(30);
	}
}
		

class Outer{
	class Inner{
		Inner(){
			System.out.println("In Inner-Constructor");
		}
	}

	public static void main(String[] args){
		Outer outObj=new Outer();
		Outer.Inner obj=outObj.new Inner();
	}
}

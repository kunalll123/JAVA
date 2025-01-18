class Outer{
	void fun(){
		System.out.println("In gun");

		class Inner{
			void gun(){
				System.out.println("In fun");
				}
		}
		new Inner().gun();
	}
}

class Main{
	public static void main(String[] args){
		new Outer().fun();
	}

}

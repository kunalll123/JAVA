class Outer{
	final static class Inner{
		void fun(){
			System.out.println("In fun");
		}
	}

	class Inner2{
		void gun(){
			new Inner.fun();

			System.out.println("In gun");
		}
	}
}

class Demo{
	public static void main(String[] args){
		new Outer().new Inner2().gun();
	}
}

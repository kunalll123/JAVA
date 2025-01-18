class Gp{
	public void Print(){
		System.out.println("GP()");
	}
}

class P extends Gp{
	public void PrintParent(){
		super.Print();
		System.out.println("PP()");
	}
}

class Child extends P{
	public void PrintChild(){
		PrintParent();
		System.out.println("CP()");

	}
}
class Main{
	public static void main(String[] args){
		Child c=new Child();
		c.PrintChild();
	}
}

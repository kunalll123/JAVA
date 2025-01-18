class A{
	public int x=10;
	public int y;
	public int z;
}
class B extends A{
	public int y=20;
}

class C extends B{
	public int z=30;
}

class Demo{
	public static void main(String[] args){
		A obj=new C();

		System.out.println((obj.z)+(obj.y)+(obj.x));

		C obj1=new C();

	    System.out.println((obj1.z)+(obj1.y)+(obj1.x));
	}
}

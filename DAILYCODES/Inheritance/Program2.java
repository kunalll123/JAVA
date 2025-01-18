class Parent{
	int x=10;
	int y=20;
	Parent(){
		System.out.println("Parent constructor");
	}
}
class child extends Parent{
	child(){
		System.out.println("child constructor");
	}

	public static void main(String[] args){

		child obj=new child();
		System.out.println(obj.x);
		System.out.println(obj.y);
	}
}

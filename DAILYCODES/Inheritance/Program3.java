class Parent{
	int x=10;
	int y=20;
	Parent(){
	
		System.out.println("Parent constructor");
		System.out.println(x);
		System.out.println(y);
	}
}
class child extends Parent{
	child(int x,int y){
		System.out.println("child constructor");
		System.out.println(x);
		System.out.println(y);
	}

	public static void main(String[] args){

		child obj=new child(30,40);
		
	}
}


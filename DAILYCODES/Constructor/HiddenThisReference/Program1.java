class Demo{
	int x=20;
	Demo(int x){
		System.out.println("In Constructor");
		System.out.println(x);
	}
	public static void main(String[] args){

		Demo obj1=new Demo(10);
		
		System.out.println(obj1);
		System.out.println(obj1.x);
	}
}

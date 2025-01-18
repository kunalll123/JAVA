class Demo{
	int x=10;

	Demo(int x){
		this.x=x;
		System.out.println("In Demo Constructor");
	}

	void fun(){
		System.out.println(x);
	}

	public static void main(String[] args){
		Demo obj=new Demo(120);
		obj.fun();
	}
}

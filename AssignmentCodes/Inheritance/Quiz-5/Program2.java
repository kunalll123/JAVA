class Demo{
	int num=10;
	Demo(int num){
		System.out.println(num);
		this.num=Num;

		System.out.println(num);
		System.out.println(this);
	}
}

class Demo1 extends Demo{
	int num=100;
	Demo(int num){
		System.out.println(num);
		this.num=Num;

		System.out.println(num);
		System.out.println(this);
	}
	
	public static void main(String[] args){

		Demo obj=new Demo(15);
		Demo obj1=new Demo1(15);
	}
}


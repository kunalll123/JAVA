class Demo{
	int x=10;
	
	Demo(){
		System.out.println("In No-arguemnet constructor");
	}

	Demo(int y){
		System.out.println("In Para-Constructor");
	}

	public static void main(String[] args){

		Demo obj1=new Demo();		//Demo(obj1=Address);

		Demo obj2=new Demo(10);		//Demo(obj2,10);
	}
}

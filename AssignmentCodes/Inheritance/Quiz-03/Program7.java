class Demo{

	Object fun(){
		return new Object();
	}
}

class Main extends Demo{
	String fun(){
		String str=new String("C2W");
		return str;
	}

	public static void main(String[] args){

		Demo obj=new Demo();

		System.out.println(obj.fun());

		Demo obj1=new Main();

		System.out.println(obj1.fun());
	}
}

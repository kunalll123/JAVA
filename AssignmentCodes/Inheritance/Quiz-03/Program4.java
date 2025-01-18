class Demo{
	String method_demo(){
		return "Hii";
	}

	int method_demo(int num){
		return num+10;
	}

	float method_demo(char ch){
		return ch+0f;
	}
}

class Main{
	public static void main(String[] args){

		Demo obj=new Demo();

		System.out.println(obj.method_demo());

		System.out.println(obj.method_demo('B'));

		System.out.println(obj.method_demo('G'));
	}
}

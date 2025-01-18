class Demo{
	void str_method(String str){
		System.out.println("1"+str);
	}

	void str_method(StringBuffer sb){
		System.out.println("2"+sb);
	}
}

class Main{
	public static void main(String[] args){

		Demo obj=new Demo();

		obj.str_method("Hello Coders");

		obj.str_method(new StringBuffer("HELLO CODERS"));

		
	}
}


class Demo{
	int var1=10;
	public static void main(String[] args){
	Demo demo=new Demo();
	System.out.println(++demo.var1);
	}
}

class Client{
	public static void main(String[] args){
		System.out.println("Hello World");
		Demo demo=new Demo();
		System.out.println(++demo.var1);
	}
}
				

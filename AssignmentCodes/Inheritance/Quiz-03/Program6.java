class Demo{
	void Banking(){

		System.out.println("Online Banking");
	}
}

class Main extends Demo{
	public void banking(){
		System.out.println("RTGS Banking");
	}
	public static void main(String[] args){

		Main obj=new Main();
		obj.banking();
	}
}

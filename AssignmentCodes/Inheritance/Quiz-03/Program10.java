abstract class Demo1{
	void fun(){
		System.out.println("fun-Inside Abstract Class");
	}

	void gun(){
		System.out.println("method-gun()");
	}
}

class Client extends Demo1{

	void fun(){

		System.out.println("method - fun()");
	}

	void gun(){
		
		System.out.println("Hello - in gun()");
	}

	public static void main(String[] args){

		Demo1 obj=new Client();

		obj.fun();
		obj.gun();
	}
}

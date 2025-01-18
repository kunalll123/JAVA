class A{
	int x=10;
}

class B{
	void print(){
		System.out.print(x);
	}
}

class Client{
	public static void main(String[] args){

		B obj=new B();
		obj.print();
	}
}

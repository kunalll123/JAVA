class C2W{
	C2W(Client obj){
		C2W(1000);
	}

	C2W(int x){
		System.out.println(x);
	}

	C2W(){

	}
}

class Client{
	public static void main(String[] args){
			
		C2W obj1=new C2W();
		C2W obj=new C2W(obj1);
	}
}

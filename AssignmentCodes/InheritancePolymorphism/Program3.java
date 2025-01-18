class C2W{
	C2W(C2W obj){
		this(10);

		System.out.println(obj);
		System.out.println("In C2W");
	}

	C2W(int x){
		this(null);
		System.out.println("In C2W "+x);
	}

	public static void main(String[] args){
		C2W obj1=new C2W(1);
		C2W obj2=new C2W(obj);
	}
}

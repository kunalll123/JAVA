class Core2web{
	void Core2Web(){
		System.out.println("In core2web");
	}

	Core2web(){
		System.out.println("In Core2web Const");
	}
}

class C2W{
	public static void main(String[] args){
		Core2web obj=new Core2web();
		obj.Core2Web();
	}
}

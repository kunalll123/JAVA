class Client{
	static int i=0;
	public static void main(String[] args){
	Client obj=new Client();
	for(int j=0; j<3; j++)
		obj.m1();
	}
	void m1(){
		int i=0;
		System.out.print(i++ + " ");
	}
}

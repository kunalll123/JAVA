class Outer{

	int x=10;
	private void fun(){}
	public static void main(String[] args){
		Outer obj=new Outer(){
			int x=20;
			void fun(){
				System.out.println(x);
			}
		};
		obj.fun();
	}
}

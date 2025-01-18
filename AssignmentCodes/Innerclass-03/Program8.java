class Outer{

	int x=10;
	protected void fun(){}
}
class Demo{
	public static void main(String[] args){
		Outer obj=new Outer(){
			int x=20;
			protected void  fun(){
				System.out.println(x);
			}
		};
		obj.fun();
	}
}

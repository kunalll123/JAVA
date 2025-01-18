class Demo{
	Demo(Object obj){
		System.out.println(obj);
		}
}
class C2W{
	public static void main(String[] args){
		Demo obj;
		Demo obj1=new Demo(obj);
		Demo obj2=new Demo(obj1);
	}
}

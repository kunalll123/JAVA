class Outer {
	int x=10;
	Object fun() {
		return new String("Hi..");
	}
}

class Demo{
	public static void main(String[] agrs){

		Outer obj=new Outer(){

			int x=20;
			String fun(){
				return new String("Hey..");
			}
		};

		System.out.println(obj.fun());
	}
}

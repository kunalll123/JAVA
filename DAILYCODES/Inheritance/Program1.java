
class Parent extends Object{
		int x=10;
		 void fun(){
			System.out.println("In fun");
		}
class child extends Parent{
	child(){
		System.out.println("Child Constructor");
	}

	}
}

class client {
public static void main(String[] args){
			child obj=new child();
			System.out.println(obj.x);
			obj.fun();
	}
}


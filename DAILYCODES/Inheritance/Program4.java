class Parent1{
	Parent1(){
		System.out.println("Parent-1");
	}
}
class Parent2{
	Parent2(){
		System.out.println("Parent-2");
	}
}

class Child extends Parent1,Parent2{
	Child(){
		System.out.println("In Child");
	}

}

//In Java multiple Inheritance does not supported.

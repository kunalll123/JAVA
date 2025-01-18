import java.util.*;

class Demo{
	int x;
	Demo(int x){
		this.x=x;
	}

	void printData(){
		System.out.println(x);
	}
}

class VectorDemo{
	public static void main(String[] args){

		Vector <Object> v=new Vector <Object> ();

		v.addElement(new Demo(10));
		v.addElement(new Demo(20));
		v.addElement(new Demo(30));
		v.addElement(new Demo(40));
		v.addElement(new Demo(50));

		System.out.println(v);
	}
}

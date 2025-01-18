import java.util.*;

class ArrayListDemo extends ArrayList{
	public static void main(String[] args){

		ArrayListDemo al=new ArrayListDemo();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		al.add(70);

		System.out.println(al);

		//indexOf(Object O)

		//System.out.println( al.(5));
		
		//lastindexof(Object o)
		System.out.println(al.LastIndexOf());
	}
}

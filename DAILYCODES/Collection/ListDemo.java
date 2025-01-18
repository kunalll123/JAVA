import java.util.*;

class ListDemo{
	public static void main(String[] args){

		List <Object>l=new ArrayList<Object>();

		//add(E)

		l.add(10);
		l.add("kunal");
		l.add(30.5);
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);

		System.out.println(l);

		//add(int index, E element)
		l.add(3,"sakshi");

		System.out.println(l);

		//contains(Object o)
		System.out.println(l.contains(30));


		//get(int index)
		System.out.println(l.get(5));
		System.out.println(l);

		//isEmpty()
		System.out.println(l.isEmpty());
		System.out.println(l);

		//remove(int index)
		System.out.println(l.remove(5));
		System.out.println(l);

		//remove(object o)
		System.out.println(l.remove(50));
		System.out.println(l);

		//set(int index,E element)
		System.out.println(l.set(7,50));
		System.out.println(l);

		//size()
		System.out.println(l.size());

		//Clear()
		l.clear();
	}
}

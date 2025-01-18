import java.util.*;

class SortedSetMethods{
	public static void main(String[] args){

		SortedSet ss=new TreeSet();

		ss.add(10);
		ss.add(40);
		ss.add(60);
		ss.add(50);
		ss.add(30);
		ss.add(20);

		System.out.println(ss);

		//subset(E,E)
		//System.out.println(ss.subset(20,60));
		

		//heatSet
		System.out.println(ss.headSet(30));
	}

}

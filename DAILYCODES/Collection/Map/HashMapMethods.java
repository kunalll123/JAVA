import java.util.*;

class HasmMapMethods{
	public static void main(String[] args){

		HashMap hm=new HashMap();
		
		hm.put("D","Amazon");
		hm.put("A","Google");
		hm.put("C","Nvidia");
		hm.put("E","Persistent");
		hm.put("B","Zensar");

		//putIfAbsent
		System.out.println(hm.putIfAbsent("E","Persistent"));

		//getordefault
		//System.out.println(hm,"Google");

		//capacity()
		//hm.capacity();

		//entrySet()
		System.out.println(hm.entrySet());

		//keySet()
		System.out.println(hm.keySet());

		//Values()
		System.out.println(hm.values());
	}
}	

import java.util.*;

class MapMethods{
	public static void main(String[] args){

		Map m=new HashMap();

		//put(K,V)
		m.put("D","Amazon");
		m.put("A","MicroSoft");
		m.put("C","Apple");
		m.put("E","Google");
		m.put("B","Google");

		System.out.println(m);

		//remove(java.lang.Object)
		m.remove("C");
		System.out.println(m);

		//get(java.lang.Object)
		System.out.print(m.get("B"));

		//ContainsKey
		System.out.println(m.containsKey("C"));

		//Containsvalue
		System.out.println(m.containsValue("Google"));

		//equals
		System.out.println(m.equals("Google"));

		//putIfAbsent(K,v)
		System.out.println(m.putIfAbsent("B","Google"));

		//replace(k,v)
		System.out.println(m.replace("B","Google","Nvidia"));
		System.out.println(m);

	}
}

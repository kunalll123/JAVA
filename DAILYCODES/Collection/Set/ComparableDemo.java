import java.util.*;

class CustomString implements Comparable <CustomString> {
	String str=null;

	CustomString(String str){
		this.str=str;
	}

	public int compareTo(CustomString obj){
		return -(str.compareTo(obj.str));
	}

	public String toString(){
		return str;
	}
}

class SortedDemo{
	public static void main(String[] args){
		TreeSet t=new TreeSet();
		t.add(new CustomString("kunal"));
		t.add(new CustomString("saurabh"));
		t.add(new CustomString("vaibhav"));
		t.add(new CustomString("ankit"));

		System.out.println(t);
	}
}


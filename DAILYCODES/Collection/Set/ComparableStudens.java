import java.util.*;

class Student implements Comparable <Student> {

	int rollNo;
	String name;

	Student(int rollNo, String name){
		this.rollNo=rollNo;
		this.name=name;
	}

	public int compareTo(Student obj){
		return -(rollNo - obj.rollNo);
	}

	public String toString(){
		return name;
		
	}
	
}
class SortDemo{
	public static void main(String[] args){

		TreeSet t= new TreeSet();
		t.add(new Student(28,"Kunal"));
		t.add(new Student(29,"Vaibhav"));
		t.add(new Student(30,"yash"));
		t.add(new Student(31,"saurabh"));
		t.add(new Student(32,"durgesh"));

		System.out.println(t);
	}
}

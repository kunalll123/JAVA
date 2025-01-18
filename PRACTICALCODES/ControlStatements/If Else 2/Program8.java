import java.util.*;
	
class StudentGrade{
	public static void main(String[] args){
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the student Percentage: ");
	float percent=sc.nextFloat();
	
	if(percent>=85){
		System.out.println("Passed:first class with distinction" + percent);
	}else if(percent>=60){
		System.out.println("Passed:first class" +percent);
	}else if(percent>=54){
		System.out.println("Second class" + percent);
	}else{
		System.out.println("PASS" + percent);
		}
	}
}
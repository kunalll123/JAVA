import java.util.*;

class Question3{
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the first string: ");
		String str1=sc.next();

		System.out.println("Enter the second string: ");
		String str2=sc.next();

	
		System.out.println(str1.compareTo(str2));

		/*if(str1==str2){
			System.out.println(0);
		}else{
			System.out.println("Difference :" + str1.compareTo(str2));
		}*/
	}
}

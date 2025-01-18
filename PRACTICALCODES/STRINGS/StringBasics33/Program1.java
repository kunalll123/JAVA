import java.util.*;

class Question1{
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the first string: ");
		String str1=sc.next();

		System.out.println("Enter the second string: ");
		String str2=sc.next();

		String str3=str1.concat(str2);
		System.out.println(str3);
		System.out.println("Length of String: " + str3.length());
	}
}

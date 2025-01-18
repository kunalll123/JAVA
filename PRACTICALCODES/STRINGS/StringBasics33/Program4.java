import java.util.*;

class Question4{
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the first string: ");
		String str1=sc.next();

		System.out.println("Enter the second string: ");
		String str2=sc.next();

		if(str1.equals(str2)){

			System.out.println("True");
		}else{
			System.out.println("False");
		}
	}
}

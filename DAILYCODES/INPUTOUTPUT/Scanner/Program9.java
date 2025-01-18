import java.util.*;

class CheckRange{
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the first number:");
		int num1=sc.nextInt();

		System.out.println("Enter the second number:");
		int num2=sc.nextInt();

		for(int i=-2; i<=4; i++){
			System.out.println(num1++ + " ");
		}
	}
}

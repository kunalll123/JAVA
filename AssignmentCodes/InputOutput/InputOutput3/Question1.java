import java.util.*;

class ScannerDemo1{
	public static void main(String[] args){

		int num1=0,num2=0;

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter value for num1: ");
		num1=sc.nextInt();

		System.out.println("Enter value for num2:");
		num2=sc.nextInt();

		while(num1<=num2){
			System.out.println(--num2);
		}
	}
}

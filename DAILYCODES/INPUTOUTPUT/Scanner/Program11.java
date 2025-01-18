import java.util.*;

class NoSum{
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the first num:");
		int num1=sc.nextInt();

		System.out.println("Enter the second num:");
		int num2=sc.nextInt();
		
		int sum=0;

		for(int i=5; i<=7; i++){
			sum=sum+i;
			System.out.println(sum);
		}
	}
}

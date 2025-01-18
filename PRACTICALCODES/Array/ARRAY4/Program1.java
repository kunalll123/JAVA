import java.util.*;

class Question1{
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the array size: ");
		int size=sc.nextInt();

		int arr[]=new int[size];
		int sum=0;
		for(int i=0; i<arr.length; i++){
		       arr[i]=sc.nextInt();
		
 		sum=sum+arr[i];
		}

		int avg=sum/arr.length;

		System.out.println("Average elements average is: " +avg);		
	}
}

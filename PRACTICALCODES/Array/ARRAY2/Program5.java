import java.util.*;

class Question5{
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the array size : ");
		int size=sc.nextInt();

		int arr[]=new int[size];

		System.out.println("Enter elements in the array: ");

		for(int i=0; i<size; i++){
			arr[i]=sc.nextInt();
		}
		
		int sum=0;

		
		for(int i=1; i<size; i+=2){
				sum=sum+arr[i];
				}
		System.out.println("Sum of odd indexes is: " + sum);
	}
	
}

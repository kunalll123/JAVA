
import java.util.Scanner;

class Question3{
	public static void main(String[] args){
		

		Scanner sc=new Scanner(System.in);

	

		int arr[]=new int[10];
		int sum=0;

		System.out.println("Enter array elements are: ");
		
		for(int i=0; i<10; i++){
				 arr[i]=sc.nextInt();
		
		}

		for(int i=0; i<10; i++){
			if(arr[i]%2 != 0){
				sum += arr[i];
			
			}
		}
		System.out.println("sum : " + sum);
	}
}


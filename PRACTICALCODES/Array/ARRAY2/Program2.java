import java.util.*;

class Question2{
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the array size: ");
		int size=sc.nextInt();

		int arr[]=new int[size];

		System.out.print("Enter the elements in array: ");
		for(int i=0; i<size; i++){
			arr[i]=sc.nextInt();
		}
		
		int sum=0;
		for(int i=0; i<size; i++){
			if(arr[i] % 3 == 0){
				System.out.println("Elements divisible by 3: " + arr[i]);
			sum += arr[i];
			}
		}
		System.out.println("Sum fo elements divisible by 3 is: " +sum);
		
	}
}
				


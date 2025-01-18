import java.util.Scanner;

class Question2{
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Array size");
		int size=sc.nextInt();

		int arr[]=new int[size];

		System.out.println("Enter array elements are: ");
		
		for(int i=0; i<10; i++){
				 arr[i]=sc.nextInt();
		
		}
		
		System.out.print("Even Elements are: ");
		for(int i=0; i<10; i++){
			if(i%2 == 0){
			System.out.print(arr[i] + " ");
			}
		}
	}
}
		


import java.util.*;

class Question6{
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the array size : ");
		int size=sc.nextInt();

		int arr[]=new int[size];

		System.out.println("Enter elements in the array: ");

		for(int i=0; i<size; i++){
			arr[i]=sc.nextInt();
		}
		
		int prod=1;

		
		for(int i=1; i<size; i+=2){
				prod=prod*arr[i];
				}
		System.out.println("Product of odd indexes is: " + prod);
	}
	
}


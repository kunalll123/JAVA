import java.util.*;

class ArrayLength{
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter array size");
		int size=sc.nextInt();

		int arr[]=new int[size];

		for(int i=0; i<arr.length; i++){
			System.out.println("Enter Element: ");

			arr[i]=sc.nextInt();
		}

		System.out.println("Array Elements are : ");
		
		for(int i=0; i<arr.length; i++){

			System.out.println(arr[i]);
		}
	}
}


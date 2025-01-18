import java.util.*;

class Question2{
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the array size: ");
		int size=sc.nextInt();

		int arr[]=new int[size];

		System.out.println("Enter the elements in the array: ");

		for(int i=0; i<arr.length; i++){
			arr[i]=sc.nextInt();
		}

		int min=arr[0];
		int max=arr[0];
		for(int i=1; i<arr.length;i++){

			if(arr[i]<min){
				min=arr[i];
			}
			System.out.println(min);

			if(arr[i] > max){
				max=arr[i];
			}
			System.out.println(max);
		}
		int difference=max-min;
		System.out.println("The difference between the minimum and maximum elements is:"+difference);;
	}
}

import java.util.*;

class Question3{
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the array size: ");
		int size=sc.nextInt();

		int arr[]=new int[size];

		System.out.println("Enter the elements in the array: ");

		for(int i=0; i<arr.length; i++){
			arr[i]=sc.nextInt();
		}

		int num=arr[0];
		int slarg=arr[0];
		for(int i=0; i<arr.length;i++){

			if(arr[i]>=num){
				num=arr[i];
			}
		}
		System.out.println(num);
		
		for(int i=0; i<arr.length; i++){
			if(arr[i] < num && arr[i]>=slarg){
				slarg=arr[i];
				}
			}
			System.out.println("Second largest is"+slarg);
		}
}

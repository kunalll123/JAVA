import java.util.*;

class Question7{
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter array size: ");
		int size=sc.nextInt();

		int arr[]=new int[size];

		System.out.println("Enter elements in array: ");

		for(int i=0; i<size; i++){
			arr[i]=sc.nextInt();
		}

			if(size%2==0){
				for(int i=0; i<size; i += 2){
				System.out.print(arr[i] + " ");
			}
		}else{
			for(int i=0; i<size; i++){
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
	}
}

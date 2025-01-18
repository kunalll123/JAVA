import java.util.*;

class Question10{
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter array size: ");
		int size=sc.nextInt();

		int arr[]=new int[size];


		System.out.println("Enter elements in the array: ");
		for(int i=0; i<size; i++){
			arr[i]=sc.nextInt();
		}

		
		/*int maxIndex=0;
		int max=arr[0];
	
			
		for(int i=1; i<size; i++){
			if(arr[i]>max){
				max = arr[i];
				maxIndex=i;
			}
		}
				System.out.println("Maximun number in the array is found at pos: " + (maxIndex + 1) + " is " + max);
		}*/

		int minIndex=0;
		int min=arr[0];
	
			
		for(int i=0; i<size; i++){
			if(arr[i]<min){
				min = arr[i];
				minIndex=i;
			}
		}
				System.out.println("Minimum number in the array is found at pos: " + (minIndex + 1) + " is " + min);
		}
}



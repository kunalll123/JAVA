import java.util.*;

class Question8{
	public static void main(String[] args){

		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the array size: ");
		int size=sc.nextInt();

		int arr[]=new int[size];

		System.out.println("Enter array elements: ");
		for(int num=1; num<size; num++){
			arr[num]=sc.nextInt();
		}
		
		for(int num=1; num<size; num++){
			if(num % 2 == 0){
				System.out.println(num + "is an odd indexed elements");
			}
		}
	}
}

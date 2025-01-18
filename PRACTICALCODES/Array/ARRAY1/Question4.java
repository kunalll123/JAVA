import java.util.*;

class Question4{
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);


		int arr[]=new int[10];
		
	
		System.out.println("Enter array elements are: ");
		for(int num=0; num<10; num++){
			 arr[num]=sc.nextInt();
		}

		
		for(int num=0; num<10; num++){
			if(num<10){
				System.out.println(num + " is less than 10");
			}
		}
	}
}

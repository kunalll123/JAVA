import java.util.*;

class Question5{
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		int arr[]=new int[10];

		System.out.println("Enter array elements are: ");
		for(int i=0; i<10; i++){
			arr[i]=sc.nextInt();
		}

		System.out.println("Number is divisible by 4: ");
			for(int i=0; i<10; i++){
				if(arr[i]%4==0){
				System.out.println("Index: " + i + ",Element: " + arr[i]);
			}
		}
	}
}


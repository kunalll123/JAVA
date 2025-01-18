import java.util.*;

class Pattern7{
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.print("Enter the row: ");
		int row=sc.nextInt();
		
		int num=2;

		for(int i=1; i<=row; i++){

			for(int j=1; j<=i; j++){
				System.out.print(j*num + " ");
			}
			System.out.println();
		}
	}
}


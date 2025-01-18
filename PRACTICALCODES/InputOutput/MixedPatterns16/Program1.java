import java.util.*;

class Pattern1{
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.print("Enter the row : ");
		int row=sc.nextInt();

		int num=1;

		for(int i=1; i<=row; i++){

			for(int j=1; j<=row; j++){

				System.out.print(num++ + " ");
			}
			System.out.println();
		}
	}
}

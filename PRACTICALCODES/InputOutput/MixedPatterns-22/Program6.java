import java.util.*;

class Pattern6{
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the row: ");
		int row=sc.nextInt();

		

		for(int i=1; i<=row; i++){
			int num=1;
			for(int sp=1; sp<=row-i; sp++){

				System.out.print("\t");
			}
		
			for(int j=1; j<=i*2-1; j++){

				System.out.print(num + "\t");
				num++;
			}
			System.out.println();
		}
	}
}

import java.util.*;

class Pattern6{
	public static void main(String[] args){
	
		Scanner sc=new Scanner(System.in);


		System.out.println("Enter the row: ");
		int row=sc.nextInt();

		char ch=65;

		for(int i=row; i>=0; i--){

			for(int sp=1; sp<=row-i; sp++){

				System.out.print("\t");

			}

			for(int j=1; j<=i*2-1; j++){
				
				System.out.print(ch +"\t");
				
			}
			ch++;
			System.out.println();
		}
	}
}



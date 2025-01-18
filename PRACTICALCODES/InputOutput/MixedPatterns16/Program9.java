import java.util.*;

class Pattern9{
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.print("Enter the row: ");
		int row=sc.nextInt();
		
		int ch=74;
		for(int i=1; i<=row; i++){

			for(int j=i; j<=row; j++){
				System.out.print((char)ch-- + " ");
				
			}
			
			System.out.println();
		}
	}
}


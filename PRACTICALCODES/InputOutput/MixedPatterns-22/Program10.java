import java.util.*;

class Pattern10{
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the row: ");
		int row=sc.nextInt();
		
		
		for(int i=1; i<=row; i++){
					
			for(int sp=1; sp<=row-i; sp++){
		
				System.out.print("\t");
			}

			

			for(int j=1; j<=i; j++){
				System.out.print(j +"\t");
			}

				if(i>1){
					for(int j=i-1; j>=1; j--){

					System.out.print(j +"\t");
					}
				}
					
			System.out.println();
			
		
		}
		
	}
}



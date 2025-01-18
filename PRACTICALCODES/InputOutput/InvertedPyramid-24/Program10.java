import java.util.*;

class Pattern10{
	public static void main(String[] args){
	
		Scanner sc=new Scanner(System.in);


		System.out.println("Enter the row: ");
		int row=sc.nextInt();

		for(int i=1; i<=row; i++){
			
			int num=4;
			for(int sp=1; sp<i; sp++){

				System.out.print("\t");

			}

			for(int j=1; j<=(row-i)*2+1; j++){

				if(j>=row-i+1){
				
					System.out.print(num++ +"\t");
				
			}else{
				System.out.print(num-- +"\t");
			}
			}
			
			System.out.println();
			
		}
	}
}





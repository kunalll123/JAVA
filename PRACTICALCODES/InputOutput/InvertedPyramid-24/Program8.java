import java.util.*;

class Pattern8{
	public static void main(String[] args){
	
		Scanner sc=new Scanner(System.in);


		System.out.println("Enter the row: ");
		int row=sc.nextInt();

		for(int i=1; i<=row; i++){

			for(int sp=1; sp<i; sp++){

				System.out.print("\t");

			}

			for(int j=1; j<=(row-i)*2+1; j++){

				if(j%2 == 1){
					System.out.print("1" +"\t");
				}else{
					System.out.print("0" +"\t");
				}
				
			}
			System.out.println();
		}
	}
}




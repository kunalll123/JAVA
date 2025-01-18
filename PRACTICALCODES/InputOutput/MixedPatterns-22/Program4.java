import java.util.*;

class Pattern4{
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the row: ");
		int row=sc.nextInt();
		
		for(int i=1; i<=row; i++){
			int num=i;
			for(int sp=1; sp<i; sp++){

				System.out.print("\t");
			}
		
			for(int j=row; j>=i; j--){

				if(row%2 ==1){

					if(j%2 == 0){
				
						System.out.print((char)(64+num) +"\t");
			}else{
				System.out.print((char)(64+num)  +"\t");
				}	
			}

				else{
					if(row%2 == 0){
						System.out.print((char)(96+num) +"\t");
					}else{
						System.out.print((char)(96+num) +"\t");
					}
				}
				num++;	
				}
			System.out.println();
		}			
		
	}
}

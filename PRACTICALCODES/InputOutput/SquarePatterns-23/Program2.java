import java.util.*;

class Pattern2{
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the row: ");
		int row=sc.nextInt();
		int num=row;

		for(int i=1; i<=row; i++){
			int num2=row-i;
			for(int j=1; j<=row; j++){

				if(num2>0){
					System.out.print((char)(96+num) + " ");
				}else{
					System.out.print((char)(64+num) + " ");
				}
				num2--;
				num++;
			}
			System.out.println();
		}	
	}
}


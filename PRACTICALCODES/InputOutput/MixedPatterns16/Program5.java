import java.util.*;

class Pattern5{
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.print("Enter the row: ");
		int row=sc.nextInt();
		
		
		int num=1;

		for(int i=1; i<=row; i++){
			for(int j=1; j<=i; j++){
				if(i % 2 != 0){
				System.out.print(num*j + " ");
			}else{
				System.out.print(num*j + " ");
			}
			}
			num++;
			System.out.println();
		}
	}
}


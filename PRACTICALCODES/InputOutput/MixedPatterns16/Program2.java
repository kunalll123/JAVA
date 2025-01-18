import java.util.*;

class Pattern2{
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.print("Enter the row : ");
		int row=sc.nextInt();

		int ch=64+row;
		int num=row;
		
		for(int i=1; i<=row; i++){

			for(int j=1; j<=row; j++){
				if(i % 2 != 0){
					System.out.print((char)ch+""+num-- +" ");
			}else{
				System.out.print((char)ch+""+num-- +" ");
				}
			} 
			num=row+i;
			System.out.println();
		}
	}
}


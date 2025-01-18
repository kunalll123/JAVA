import java.util.*;

class Pattern7{
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.print("Enter the row: ");
		int row=sc.nextInt();

		for(int i=1; i<=row; i++){
			int num=4;
			int ch=100;
			for(int j=1; j<=i; j++){
				if(i % 2 != 0){
					System.out.print((char)ch-- + " ");
				}else{
					System.out.print(num-- + " ");
				}
			}
			System.out.println();
		}
	}
}

import java.util.*;

class Pattern9{
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the row: ");
		int row=sc.nextInt();

		for(int i=1; i<=row; i++){
			int num=row*i*(row-i+1);
			for(int j=1; j<=row; j++){

				if(j%2==0){
					System.out.print("@ ");
				}else{
					System.out.print(num+ " ");
				}
				num-=i;
			}
			System.out.println();
		}	
	}
}




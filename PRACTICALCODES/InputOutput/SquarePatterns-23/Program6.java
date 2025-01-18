import java.util.*;

class Pattern6{
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the row: ");
		int row=sc.nextInt();

		for(int i=1; i<=row; i++){
			int num=row*row;
			for(int j=1; j<=row; j++){

				if(i%2==1){
					System.out.print(num+" ");
					num--;
				}else{
					if(j%2==0){
						num=num-5;
						System.out.print(num+" ");
				}
				else{
					System.out.print(num+" ");
				}
			}
			
			}
			System.out.println();
		}	
	}
}

